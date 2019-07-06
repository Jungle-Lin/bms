package top.lin.login.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.lin.login.dao.LoginDao;
import top.lin.login.entity.SystemUser;
import top.lin.login.service.LoginService;
import top.lin.utils.JwtUtil;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:54
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    /**
     * 通过登录查询登录的相关信息
     * <p>
     * //todo redis
     *
     * @param account  账号
     * @param password 密码
     * @return 返回json结果
     */
    @Override
    public JSONObject inquireLoginInfoByAccount(String account, String password) {
        JSONObject json = new JSONObject();
//        SystemUser user = JSONObject.parseObject(redisTemplate.boundHashOps("users").get(account).toString(), SystemUser.class);
//        if (user == null) {
//
//            redisTemplate.boundHashOps("users").put(account, JSONObject.toJSONString(user));
//        }
        SystemUser user = loginDao.findSystemUserByAccount(account);
        if (user == null || user.getIsDel().equals("1")) {
            json.put("code", 0);
            json.put("msg", "账号不存在");
            return json;
        } else if (user.getStatus().equals("2")) {
            json.put("code", 0);
            json.put("msg", "账号停用");
            return json;
        } else if (user.getStatus().equals("3")) {
            json.put("code", 0);
            json.put("msg", "账号被锁定");
            return json;
        } else if (user.getLockNum() >= user.getErrorNum()) {
            SystemUser user1 = new SystemUser();
            user1.setId(user.getId());
            user1.setStatus("3");
            loginDao.saveAndFlush(user1);
            json.put("code", 0);
            json.put("msg", "账号被锁定");
            return json;
        }
        String password1 = JwtUtil.decoding(user.getPassword());
        if (!password.equals(password1)) {
            SystemUser user1 = new SystemUser();
            user1.setId(user.getId());
            user1.setErrorNum(user.getErrorNum() + 1);
            loginDao.saveAndFlush(user1);
            json.put("code", 0);
            json.put("msg", "账号或密码错误");
            return json;
        } else {
            SystemUser user1 = new SystemUser();
            user1.setId(user.getId());
            user1.setErrorNum(0);
            loginDao.saveAndFlush(user1);
            json.put("code", 1);
            json.put("msg", "success");
            json.put("token", JwtUtil.sign(user.getId(), user.getAccount()));
            return json;
        }
    }
}
