package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.lin.shop.entity.BisShopUser;
import top.lin.shop.entity.EmpPage;
import top.lin.shop.entity.OwnerPage;

import java.util.List;

/**
 * @Classname BisShopUserMapper
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/5 18:47
 */
@Mapper
public interface BisShopUserMapper {

    /**
     * 查询所有店铺员工信息
     * @return
     */
    public List<BisShopUser> getAllBisShopUsers();


    /**
     * 根据用户id查询信息
     * @param shopUserId
     * @return
     */
    public BisShopUser getById(String shopUserId);


    /**
     * 获取所有店主信息
     * @return
     */
    public List<BisShopUser> getAllBoss();

    /**
     * 分页查询当前页的店主信息
     * @param ownerPage
     * @return
     */
    List<BisShopUser> listShop(@Param("ownerPage") OwnerPage ownerPage, @Param("bisShopUser")BisShopUser bisShopUser);


    /**
     * 分页获取数据库中店主的行数
     * @param bisShopUser
     * @return
     */
    Integer getTotal(@Param("bisShopUser")BisShopUser bisShopUser);

    /**
     * 添加店长信息
     * @param bisShopUser
     */
    void addShopUser(BisShopUser bisShopUser);

    /**
     * 更新用户信息
     * @param bisShopUser
     */
    void updateShopUser(BisShopUser bisShopUser);

    /**
     * 根据主键删除用户信息
     * @param shopUserId
     */
    void deleteByShopUserId(String shopUserId);

    /**
     * 实现员工表的当前页查询
     * @param empPage
     * @return
     */
    List<BisShopUser> listemp(EmpPage empPage);

    /**
     * 查询数据库中员工的总数
     * @param empPage
     * @return
     */
    Integer listTotal(EmpPage empPage);

    void updatePwd(BisShopUser bisShopUser);

    List<BisShopUser> findByAccount(@Param("account") String account);

    /**
     * 获取表里的最后一个记录号的id
     * @return
     */
    String findLastId();
}
