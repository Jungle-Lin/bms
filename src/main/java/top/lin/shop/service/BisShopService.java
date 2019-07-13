package top.lin.shop.service;

import top.lin.dictionary.entity.SystemDictionary;
import top.lin.shop.entity.BisShop;
import top.lin.shop.entity.ShopPage;

import java.util.List;
import java.util.Map;

public interface BisShopService {

    /**
     * 查询所有店铺信息
     *
     * @return
     */
    public List<BisShop> getAllBisShops();

    /**
     * 分页查询店铺信息表信息
     *
     * @param shopPage
     * @return
     */
    public List<BisShop> listShop(ShopPage shopPage);

    Integer getTotal(ShopPage shopPage);

    Map<String, Object> getPage(ShopPage shopPage);

    List<SystemDictionary> getStatus();

    BisShop getShopByShopId(String shopId);

    List<SystemDictionary> getType();

    void addShop(BisShop bisShop);

    void deleteShopByShopId(String shopId);

    void updateShop(BisShop bisShop);

    List<BisShop> findByshopName(String shopName);
}
