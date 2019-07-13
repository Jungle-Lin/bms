package top.lin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.dictionary.entity.SystemDictionary;
import top.lin.shop.dao.BisShopMapper;
import top.lin.shop.entity.BisShop;
import top.lin.shop.entity.ShopPage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BisShopServiceImpl implements BisShopService {

    @Autowired
    private BisShopMapper bisShopMapper;

    @Override
    public List<BisShop> getAllBisShops() {
        System.out.println(bisShopMapper.getAllBisShops());
        return bisShopMapper.getAllBisShops();
    }

    /**
     * 分页查询店铺信息表信息
     *
     * @param shopPage
     * @return
     */
    @Override
    public List<BisShop> listShop(ShopPage shopPage) {
        System.out.println(bisShopMapper.listShop(shopPage));
        return bisShopMapper.listShop(shopPage);
    }

    /**
     * 根据传参统计行数
     *
     * @param shopPage
     * @return
     */
    @Override
    public Integer getTotal(ShopPage shopPage) {
        return bisShopMapper.getTotal(shopPage);
    }

    @Override
    public Map<String, Object> getPage(ShopPage shopPage) {
//        System.out.println(shopPage);
//        System.out.println(bisShopMapper.listShop(shopPage));
        Map<String, Object> map = new HashMap<>();
        map.put("rows", bisShopMapper.listShop(shopPage));
        map.put("total", bisShopMapper.getTotal(shopPage));
        return map;
    }

    @Override
    public List<SystemDictionary> getStatus() {
        return bisShopMapper.getStatus();
    }

    @Override
    public BisShop getShopByShopId(String shopId) {
        return bisShopMapper.getShopByShopId(shopId);
    }

    @Override
    public List<SystemDictionary> getType() {
        return bisShopMapper.getType();
    }

    @Override
    public void addShop(BisShop bisShop) {
//        long time = new Date().getTime();
//        bisShop.setShopId(time+"");
        String lastId = bisShopMapper.findLastId();
        long i = Long.parseLong(lastId) + 1;
        bisShop.setShopId(i + "");
        bisShopMapper.addShop(bisShop);
    }

    @Override
    public void deleteShopByShopId(String shopId) {
        bisShopMapper.deleteShopByShopId(shopId);
    }

    @Override
    public void updateShop(BisShop bisShop) {
        bisShopMapper.updateShop(bisShop);
    }

    @Override
    public List<BisShop> findByshopName(String shopName) {
        return bisShopMapper.findByshopName(shopName);
    }
}
