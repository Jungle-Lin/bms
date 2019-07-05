package top.lin.shop.dao;

import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShop;

import java.util.List;

@Repository
public interface BisShopMapper {

    public List<BisShop> getAllBisShops();
}

