package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShopUser;

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
}
