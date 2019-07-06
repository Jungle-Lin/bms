package top.lin.login.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:53
 */
public interface LoginService {
    JSONObject inquireLoginInfoByAccount(String account, String password);
}
