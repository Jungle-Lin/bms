package top.lin.shop.dao;

import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShopPost;

import java.util.List;

@Repository
public interface BisShopPostMapper {

    public List<BisShopPost> getAllBisShopPosts();
}
