package top.lin.shop.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname ShopPage
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/6 13:12
 */

@Data
public class ShopPage implements Serializable {
    private String shopId;
    private String shopName;
    private String showStatus;
    private String account;
    private String shopLicense;
    private String shortName;
    private Integer limit;
    private Integer offset;
}
