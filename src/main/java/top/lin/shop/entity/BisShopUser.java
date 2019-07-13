package top.lin.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

/**
 * @Classname BisShopUser
 * @Description 商铺用户信息表
 * @Author BY WangYinshan
 * @Date 2019-07-05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BisShopUser implements Serializable {


    /**
     * 用户编号
     */
    private String shopUserId;

    /**
     * 用户类型 1 店主 2员工
     */
    private String userType;

    /**
     * 店铺编号
     */
    private String shopId;

    /**
     * 账号
     */
    private String account;

    /**
     * 姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像照片
     */
    private String photo;

    /**
     * 工号
     */
    private String workNumber;

    /**
     * 性别1:男2:女3:保密
     */
    private String sex;

    /**
     * 职位编码
     */
    private String postCode;

    /**
     * 入职日期
     */
    private String entryDate;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出生日期
     */
    private String bornDate;

    /**
     * 身份证
     */
    private String idno;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 紧急联系人
     */
    private String linkman;

    /**
     * 紧急联系电话
     */
    private String linkphone;

    /**
     * 状态0:禁用1:启用 0:离职 1:在职
     */
    private String status;

    /**
     * 是否删除0有效1删除
     */
    private String isDel;

    /**
     * 备注
     */
    private String remark;

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


    //用于分页显示的外表的字段 店铺名称，职位
    private String shopName;
    private String postName;


    /**
     * 店长或店员所属的店铺
     *
     */
    private BisShop bisShop;


    //    public void setCreateTime(Date createTime) {
//
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime = dateFormat.format(createTime);
//        this.createTime = dateTime;
//    }
//
//    public void setModifyTime(Date modifyTime) {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime = dateFormat.format(modifyTime);
//        this.modifyTime = dateTime;
//    }

}
