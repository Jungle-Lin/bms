package top.lin.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lin.shop.entity.BisShop;
import top.lin.shop.service.BisShopService;

import java.util.List;

@RestController
@RequestMapping("bisShop")
public class BisShopController {

    @Autowired
    private BisShopService bisShopService;

    @RequestMapping("getAll")
    public List<BisShop> getAllBisShops(){
        return bisShopService.getAllBisShops();
    }
}
