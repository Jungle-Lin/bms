package top.lin.shop.service;

import top.lin.dictionary.entity.SystemDictionary;
import top.lin.shop.entity.BisShopUser;
import top.lin.shop.entity.EmpPage;
import top.lin.shop.entity.OwnerPage;

import java.util.List;
import java.util.Map;

/**
 * @Classname BisShopUserService
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/5 18:50
 */
public interface BisShopUserService {

    /**
     * 查询所有员工信息
     * @return
     */
    public List<BisShopUser> getAllBisShopUsers();

    /**
     * 获取所有店主信息
     * @return
     */
    public List<BisShopUser> getAllBoss();

    Map<String, Object> getPage(OwnerPage ownerPage,BisShopUser bisShopUser);

    void addShopUser1(BisShopUser bisShopUser);

    BisShopUser getByShopUserId(String shopUserId);

    void updateShopUser(BisShopUser bisShopUser);

    void deleteByShopUserId(String shopUserId);


    /**
     * 分页查询员工信息
     *
     * @param
     * @return
     */
    Map<String, Object> getPage1(EmpPage empPage);

    List<BisShopUser> findByAccount(String account);
}
