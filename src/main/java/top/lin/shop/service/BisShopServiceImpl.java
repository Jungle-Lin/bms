package top.lin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.shop.dao.BisShopMapper;
import top.lin.shop.entity.BisShop;

import java.util.List;

@Service
public class BisShopServiceImpl implements BisShopService{

    @Autowired
    private BisShopMapper bisShopMapper;

    @Override
    public List<BisShop> getAllBisShops() {
        return bisShopMapper.getAllBisShops();
    }
}
