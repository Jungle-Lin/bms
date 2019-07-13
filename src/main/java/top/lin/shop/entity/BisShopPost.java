package top.lin.shop.entity;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

/**
 * @Classname BisShopPost
 * @Description 职位信息表
 * @Author BY WangYinshan
 * @Date 2019-07-05
 */

@Data
public class BisShopPost implements Serializable {


    /**
     * 职位编号
     */
    private String postId;

    /**
     * 职位名称
     */
    private String postName;

    /**
     * 职位编码
     */
    private String postCode;

    /**
     * 职位描述
     */
    private String postDesc;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人ID
     */
    private String createUserId;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 修改用户ID
     */
    private String modifyUserId;

    public void setCreateTime(Date createTime) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(createTime);
        this.createTime = dateTime;
    }

    public void setModifyTime(Date modifyTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(modifyTime);
        this.modifyTime = dateTime;
    }


}
