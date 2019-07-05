package top.lin.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:51
 */
@RestController
public class LoginController {
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
