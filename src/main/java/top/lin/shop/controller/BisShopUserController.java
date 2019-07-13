package top.lin.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lin.shop.entity.BisShopUser;
import top.lin.shop.entity.EmpPage;
import top.lin.shop.entity.OwnerPage;
import top.lin.shop.entity.ResultVO;
import top.lin.shop.service.BisShopUserService;
import top.lin.util.ResultVOUtil;

import java.util.List;
import java.util.Map;

/**
 * @Classname BisShopUserController
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/5 19:00
 */
@RestController
@RequestMapping("shopUser")
public class BisShopUserController {

    @Autowired
    private BisShopUserService bisShopUserService;

    /**
     * 查询所有员工信息
     *
     * @return
     */
    @RequestMapping("getAll")
    public ResultVO getAllBisShopUsers() {
        List<BisShopUser> allBisShopUsers = bisShopUserService.getAllBisShopUsers();
        if (allBisShopUsers != null) {
            return ResultVOUtil.success("查询成功", allBisShopUsers);
        } else {
            return ResultVOUtil.error("查询失败", null);
        }
    }

    /**
     * 获取所有店主信息
     *
     * @return
     */
    @RequestMapping("getBoss")
    public List<BisShopUser> getAllBoss() {
        return bisShopUserService.getAllBoss();
    }

    /**
     * 分页查询店主信息
     *
     * @param
     * @return
     */
    @RequestMapping("getPage")
    public Map<String, Object> listShop(OwnerPage ownerPage, BisShopUser bisShopUser) {
//        System.out.println(ownerPage);
//        System.out.println(bisShopUser);
//        System.out.println(bisShopUserService.getPage(ownerPage,bisShopUser));
        return bisShopUserService.getPage(ownerPage, bisShopUser);
    }

    /**
     * 添加店长信息
     *
     * @param bisShopUser
     * @return
     */
    @RequestMapping("addShopUser")
    public ResultVO addShopUser1(BisShopUser bisShopUser) {
//        System.out.println("添加的店长信息:" + bisShopUser);
        bisShopUserService.addShopUser1(bisShopUser);
        return ResultVOUtil.success("添加成功", null);
    }

    /**
     * 根据主键查询店长/店员信息
     * @param shopUserId
     * @return
     */
    @RequestMapping("getByShopUserId")
    public BisShopUser getByShopUserId(String shopUserId){
        return bisShopUserService.getByShopUserId(shopUserId);
    }

    /**
     * 检查账号的唯一性
     * @param account
     * @return
     */
    @RequestMapping("findByAccount")
    public ResultVO findByAccount(String account){
            List<BisShopUser> user = bisShopUserService.findByAccount(account);
        if (user != null) {
            return ResultVOUtil.error("该账号已被占用", user);
        } else {
            return ResultVOUtil.success("该账号空缺", null);
        }
    }


    /**
     * 修改店长信息
     */
    @RequestMapping("updateShopUser")
    public ResultVO updateShopUser(BisShopUser bisShopUser){
        bisShopUserService.updateShopUser(bisShopUser);
        return ResultVOUtil.success("修改成功", null);
    }

    /**
     * 根据主键删除店长/员工信息
     */
    @RequestMapping("deleteByShopUserId")
    public ResultVO deleteByShopUserId(String shopUserId){
        bisShopUserService.deleteByShopUserId(shopUserId);
        return ResultVOUtil.success("删除成功", null);
    }

    /**
     * 分页查询员工信息
     *
     * @param
     * @return
     */
    @RequestMapping("getPage1")
    public Map<String, Object> listShop(EmpPage empPage) {
//        System.out.println(empPage);
//        System.out.println(bisShopUserService.getPage1(empPage));
        return bisShopUserService.getPage1(empPage);
//        return null;
    }

    /**
     * 根据主键修改用户密码
     */
    @RequestMapping("updatePwd")
    public ResultVO updatePwd(BisShopUser bisShopUser){
        bisShopUserService.updateShopUser(bisShopUser);
        return ResultVOUtil.success("修改密码成功", null);
    }
}
