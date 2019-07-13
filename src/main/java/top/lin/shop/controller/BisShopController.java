package top.lin.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.lin.dictionary.entity.SystemDictionary;
import top.lin.shop.entity.BisShop;
import top.lin.shop.entity.BisShopUser;
import top.lin.shop.entity.ResultVO;
import top.lin.shop.entity.ShopPage;
import top.lin.shop.service.BisShopService;
import top.lin.shop.service.BisShopUserService;
import top.lin.util.ResultVOUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("shop")
public class BisShopController {

    @Autowired
    private BisShopService bisShopService;

    @Autowired
    private BisShopUserService bisShopUserService;

    /**
     * 查询所有店铺信息
     *
     * @return
     */
    @RequestMapping("getAll")
    public ResultVO getAllBisShops() {
        List<BisShop> shopList = bisShopService.getAllBisShops();
        if (shopList != null) {
            return ResultVOUtil.success("查询成功", shopList);
        } else {
            return ResultVOUtil.error("数据库未查询到数据", null);
        }
    }

    /**
     * 分页查询店铺信息表信息
     *
     * @param
     * @return
     */
    @RequestMapping("getPage")
    public Map<String, Object> listShop(ShopPage shopPage) {
        return bisShopService.getPage(shopPage);
    }


    /**
     * 获取店铺的状态下拉框信息
     * @return
     */
    @RequestMapping("getStatus")
    public List<SystemDictionary> getStatus(){
        return bisShopService.getStatus();
    }

    @RequestMapping("getShopByShopId")
    public BisShop getShopByShopId(String shopId){
//        System.out.println("1111111111111");
        return bisShopService.getShopByShopId(shopId);
    }

    /**
     * 获取所有店主信息
     * 账号下拉框
     * @return
     */
    @RequestMapping("getBoss")
    public List<BisShopUser> getAllBoss(){
        return bisShopUserService.getAllBoss();
    }

    /**
     * 获取商铺类型信息
     * 商铺类型下拉框
     * @return
     */
    @RequestMapping("getType")
    public List<SystemDictionary> getType(){
        return bisShopService.getType();
    }

    /**
     * 添加商铺信息
     * @return
     */
    @RequestMapping("addShop")
    public ResultVO addShop(BisShop bisShop){
//        System.out.println("bisShop:"+bisShop);
        bisShopService.addShop(bisShop);
        return ResultVOUtil.success("查询成功", null);
    }

    /**
     * 批量删除商铺信息
     * @return
     */
    @RequestMapping("deleteShopByShopId")
    public ResultVO deleteShopByShopId(String shopId){
//        System.out.println(Arrays.toString(shopIds));
        bisShopService.deleteShopByShopId(shopId);
        return ResultVOUtil.success("删除成功", null);
    }

    /**
     * 修改商铺信息
     */
    @RequestMapping("updateShop")
    public ResultVO updateShop(BisShop bisShop){
        bisShopService.updateShop(bisShop);
        return ResultVOUtil.success("修改成功", null);
    }

    /**
     * 判断商铺名称是否唯一
     */
    @RequestMapping("findByshopName")
    public ResultVO findByshopName(String shopName){
        List<BisShop> shopList = bisShopService.findByshopName(shopName);
        if (shopList != null) {
            return ResultVOUtil.error("商铺名称被占用", shopList);
        } else {
            return ResultVOUtil.success("商铺名称空缺", null);
        }
    }
}
