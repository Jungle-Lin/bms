package top.lin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.shop.dao.BisShopUserMapper;
import top.lin.shop.entity.BisShopUser;
import top.lin.shop.entity.EmpPage;
import top.lin.shop.entity.OwnerPage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname BisShopUserServiceImpl
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/5 18:57
 */

@Service
public class BisShopUserServiceImpl implements BisShopUserService{

    @Autowired
    private BisShopUserMapper bisShopUserMapper;

    @Override
    public List<BisShopUser> getAllBisShopUsers() {
        return bisShopUserMapper.getAllBisShopUsers();
    }

    /**
     * 获取所有店主信息
     *
     * @return
     */
    @Override
    public List<BisShopUser> getAllBoss() {
        return bisShopUserMapper.getAllBoss();
    }

    @Override
    public Map<String, Object> getPage(OwnerPage ownerPage,BisShopUser bisShopUser) {
        //        System.out.println(ownerPage);
//        System.out.println(bisShopUserMapper.listShop(shopPage));
        Map<String, Object> map = new HashMap<>();
        map.put("rows", bisShopUserMapper.listShop(ownerPage,bisShopUser));
        map.put("total", bisShopUserMapper.getTotal(bisShopUser));
        return map;
    }

    @Override
    public void addShopUser1(BisShopUser bisShopUser) {
//        long time = new Date().getTime();
//        bisShopUser.setShopUserId(time+"");
        String lastId = bisShopUserMapper.findLastId();
        long i = Long.parseLong(lastId) + 1;
        bisShopUser.setShopUserId(i + "");
        bisShopUserMapper.addShopUser(bisShopUser);
    }

    @Override
    public BisShopUser getByShopUserId(String shopUserId) {
        return bisShopUserMapper.getById(shopUserId);
    }

    @Override
    public void updateShopUser(BisShopUser bisShopUser) {
        bisShopUserMapper.updateShopUser(bisShopUser);
    }

    @Override
    public void deleteByShopUserId(String shopUserId) {
        bisShopUserMapper.deleteByShopUserId(shopUserId);
    }

    /**
     * 分页查询员工信息
     *
     * @param empPage@return
     */
    @Override
    public Map<String, Object> getPage1(EmpPage empPage) {
//        System.out.println(empPage);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", bisShopUserMapper.listemp(empPage));
        map.put("total", bisShopUserMapper.listTotal(empPage));
        return map;
    }

    /**
     * 检查账号的唯一性
     * @param account
     * @return
     */
    @Override
    public List<BisShopUser> findByAccount(String account) {
        return bisShopUserMapper.findByAccount(account);
    }

}
