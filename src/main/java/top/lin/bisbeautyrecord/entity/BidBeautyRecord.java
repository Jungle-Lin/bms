package top.lin.bisbeautyrecord.entity;

import lombok.Data;

/**
 * @Type
 * @Author ysj
 * @Date 2019/7/5
 */
@Data
public class BidBeautyRecord {
    private String recordId;
    private String orderId;
    private String cdKey;
    private String customUserId;
    private Integer beautyNum;
    private Integer giveNum;
    private Double totalMoney;
    private Double singePrice;
    private String recordType;
    private String vaildStatus;
    private String payTime;
    private String shopId;
    private Integer remainNum;
}
