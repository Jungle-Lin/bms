package top.lin.shop.service;

import top.lin.shop.entity.BisShopPost;
import top.lin.shop.entity.OwnerPage;

import java.util.List;
import java.util.Map;

public interface BisShopPostService {

    /**
     * 查询所有职位信息
     * @return
     */
    public List<BisShopPost> getAllBisShopPosts();

    Map<String, Object> getPage(OwnerPage ownerPage, BisShopPost bisShopPost);

    BisShopPost findByPostCode(String postCode);

    BisShopPost findByPostName(String postName);

    void addPost(BisShopPost bisShopPost);

    void deleteByPostId(String postId);

    BisShopPost findByPostId(String postId);

    void updatePost(BisShopPost bisShopPost);
}
