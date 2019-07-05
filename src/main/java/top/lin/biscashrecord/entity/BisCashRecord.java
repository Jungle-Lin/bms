package top.lin.biscashrecord.entity;

import lombok.Data;

/**
 * @Type
 * @Author ysj
 * @Date 2019/7/5
 */
@Data
public class BisCashRecord {
    private String recordId;
    private String orderId;
    private String customUserId;
    private Integer beautyNum;
    private Double monay;
    private String payWaty;
    private String cashType;
    private String payTime;
}
