package top.lin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import top.lin.shop.dao.BisShopPostMapper;
import top.lin.shop.entity.BisShopPost;

import java.util.List;

public class BisShopPostServiceImpl implements BisShopPostService {

    @Autowired
    private BisShopPostMapper bisShopPostMapper;

    @Override
    public List<BisShopPost> getAllBisShopPosts() {
        return bisShopPostMapper.getAllBisShopPosts();
    }
}
