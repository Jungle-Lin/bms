package top.lin.shop.entity;

import lombok.Data;

/**
 * @Classname EmpPage
 * @Description
 * @Created by WANGYINSHAN
 * @Date 2019/7/11 16:07
 */
@Data
public class EmpPage {
    private String account;
    private String shopName;
    private String postName;
    private String status;
    private String username;
    private String mobile;
    private String idno;
    private String workNumber;
    private Integer limit;
    private Integer offset;
}
