package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.lin.dictionary.entity.SystemDictionary;
import top.lin.shop.entity.BisShop;
import top.lin.shop.entity.ShopPage;

import java.util.List;

@Mapper
public interface BisShopMapper {

    /**
     * 查询所有店铺信息
     * @return
     */
    public List<BisShop> getAllBisShops();

    /**
     * 分页查询店铺信息表信息
     * @param shopPage
     * @return
     */
    public List<BisShop> listShop(ShopPage shopPage);


    /**
     * 根据传参统计行数
     *
     * @param shopPage
     * @return
     */
    Integer getTotal(ShopPage shopPage);

    List<SystemDictionary> getStatus();

    BisShop getShopByShopId(String shopId);

    List<SystemDictionary> getType();

    void addShop(BisShop bisShop);

    void deleteShopByShopId(String shopId);

    BisShop getShop(String ownerId);

    void updateShop(BisShop bisShop);

    /**
     * 获取表里的最后一个记录号的id
     * @return
     */
    String findLastId();

    List<BisShop> findByshopName(@Param("shopName") String shopName);
}

