package top.lin.login.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lin.login.entity.SystemUser;
import top.lin.login.service.LoginService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:51
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("")
    public String loginPage() {
        return "login/login";
    }

    @RequestMapping("/submit")
    @ResponseBody
    public String login(String account, String password, HttpServletResponse response) {
        JSONObject json = loginService.inquireLoginInfoByAccount(account, password);
        if (json.getInteger("code") == 1) {
            Cookie cookie = new Cookie("token", json.getString("token"));
            cookie.setPath("/");
            cookie.setMaxAge(-1);
            response.addCookie(cookie);
        }
        return json.toJSONString();
    }
}
