package top.lin.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:51
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage() {
        return "login/login";
    }
}
