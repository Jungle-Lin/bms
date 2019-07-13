package top.lin.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lin.shop.entity.BisShop;
import top.lin.shop.entity.BisShopPost;
import top.lin.shop.entity.OwnerPage;
import top.lin.shop.entity.ResultVO;
import top.lin.shop.service.BisShopPostService;
import top.lin.util.ResultVOUtil;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("post")
public class BisShopPostController {

    @Autowired
    private BisShopPostService bisShopPostService;

    /**
     * 查询所有职位信息
     *
     * @return
     */
    @RequestMapping("getAll")
    public ResultVO getAllBisShopPosts() {
        List<BisShopPost> shopPostList = bisShopPostService.getAllBisShopPosts();
        if (shopPostList != null) {
            return ResultVOUtil.success("查询成功", shopPostList);
        } else {
            return ResultVOUtil.error("数据库未查询到数据", null);
        }
    }

    /**
     * 实现前端分页
     */
    @RequestMapping("getPage")
    public Map<String, Object> getPage(OwnerPage ownerPage, BisShopPost bisShopPost) {
        return bisShopPostService.getPage(ownerPage, bisShopPost);
    }

    /**
     * 检查postCode的唯一性
     */
    @RequestMapping("findByPostCode")
    public ResultVO findByPostCode(String postCode) {
        BisShopPost post = bisShopPostService.findByPostCode(postCode);
        if (post != null) {
            return ResultVOUtil.error("职位编码已被占用", post);
        } else {
            return ResultVOUtil.success("该职位编码空缺", null);
        }
    }

    /**
     * 检查postName的唯一性
     */
    @RequestMapping("findByPostName")
    public ResultVO findByPostName(String postName) {
        BisShopPost post = bisShopPostService.findByPostName(postName);
        if (post != null) {
            return ResultVOUtil.error("职位名称已被占用", post);
        } else {
            return ResultVOUtil.success("该职位名称空缺", null);
        }
    }

    /**
     * 添加职位信息
     */
    @RequestMapping("addPost")
    public ResultVO addPost(BisShopPost bisShopPost) {
        bisShopPostService.addPost(bisShopPost);
        return ResultVOUtil.success("添加成功", null);
    }

    /**
     * 根据主键删除职位信息
     */
    @RequestMapping("deleteByPostId")
    public ResultVO deleteByPostId(String postId) {
        bisShopPostService.deleteByPostId(postId);
        return ResultVOUtil.success("删除成功", null);
    }

    /**
     * 根据主键查询职位信息
     */
    @RequestMapping("findByPostId")
    public BisShopPost findByPostId(String postId) {
        return bisShopPostService.findByPostId(postId);
    }

    /**
     * 修改职位信息
     */
    @RequestMapping("updatePost")
    public ResultVO updatePost(BisShopPost bisShopPost){
        bisShopPostService.updatePost(bisShopPost);
        return ResultVOUtil.success("修改成功", null);
    }

}
