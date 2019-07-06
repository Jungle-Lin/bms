package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShop;

import java.util.List;

@Mapper
public interface BisShopMapper {

    /**
     * 查询所有店铺信息
     * @return
     */
    public List<BisShop> getAllBisShops();
}

