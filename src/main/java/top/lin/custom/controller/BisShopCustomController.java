package top.lin.custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lin.custom.entity.BisCustomUser;
import top.lin.custom.service.BisCustomUserService;

import java.util.List;

@Controller
public class BisShopCustomController {
    @Autowired
    private BisCustomUserService bisCustomUserService;
    @RequestMapping("imformation")
    public String biscustomuser(){
        List<BisCustomUser> biscustomuser = bisCustomUserService.biscustomuser();
        System.out.println(biscustomuser);
        return "custom/Customer";
    }
}
