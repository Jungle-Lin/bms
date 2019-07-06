package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShopPost;

import java.util.List;

@Mapper
public interface BisShopPostMapper {

    /**
     * 查询所有职位信息
     * @return
     */
    public List<BisShopPost> getAllBisShopPosts();
}
