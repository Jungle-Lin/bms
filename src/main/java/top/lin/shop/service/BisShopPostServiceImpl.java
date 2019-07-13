package top.lin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.shop.dao.BisShopPostMapper;
import top.lin.shop.entity.BisShopPost;
import top.lin.shop.entity.OwnerPage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BisShopPostServiceImpl implements BisShopPostService {

    @Autowired
    private BisShopPostMapper bisShopPostMapper;

    @Override
    public List<BisShopPost> getAllBisShopPosts() {
        return bisShopPostMapper.getAllBisShopPosts();
    }

    @Override
    public Map<String, Object> getPage(OwnerPage ownerPage, BisShopPost bisShopPost) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", bisShopPostMapper.rows(ownerPage,bisShopPost));
        map.put("total", bisShopPostMapper.total(bisShopPost));
        return map;
    }

    @Override
    public BisShopPost findByPostCode(String postCode) {
        return bisShopPostMapper.findByPostCode(postCode);
    }

    @Override
    public BisShopPost findByPostName(String postName) {
        return bisShopPostMapper.findByPostName(postName);
    }

    @Override
    public void addPost(BisShopPost bisShopPost) {
//        Date date = new Date();
//        Long postId = date.getTime();
//        bisShopPost.setPostId(postId+"");
        String lastId = bisShopPostMapper.findLastId();
        long i = Long.parseLong(lastId) + 1;
        bisShopPost.setPostId(i + "");
        bisShopPostMapper.addPost(bisShopPost);
    }

    @Override
    public void deleteByPostId(String postId) {
        bisShopPostMapper.deleteByPostId(postId);
    }

    @Override
    public BisShopPost findByPostId(String postId) {
        return bisShopPostMapper.findByPostId(postId);
    }

    @Override
    public void updatePost(BisShopPost bisShopPost) {
        bisShopPostMapper.updatePost(bisShopPost);
    }

}
