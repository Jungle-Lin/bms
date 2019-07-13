package top.lin.shop.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.lin.shop.entity.BisShopPost;
import top.lin.shop.entity.OwnerPage;

import java.util.List;

@Mapper
public interface BisShopPostMapper {

    /**
     * 查询所有职位信息
     *
     * @return
     */
    public List<BisShopPost> getAllBisShopPosts();

    List<BisShopPost> rows(@Param("ownerPage") OwnerPage ownerPage, @Param("post") BisShopPost post);

    Integer total(BisShopPost bisShopPost);

    BisShopPost findByPostCode(String postCode);

    BisShopPost findByPostName(String postName);

    void addPost(BisShopPost bisShopPost);

    void deleteByPostId(@Param("post_id") String postId);

    BisShopPost findByPostId(@Param("post_id") String postId);

    void updatePost(BisShopPost bisShopPost);

    /**
     * 获取表里的最后一个记录号的id
     * @return
     */
    String findLastId();
}
