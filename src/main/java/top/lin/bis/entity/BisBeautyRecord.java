package top.lin.bis.entity;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Type 颜值流水
 * @Author ysj
 * @Date 2019/7/5
 */
@Data
public class BisBeautyRecord {
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

    /**
     * 时间格式化
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(payTime);
        this.payTime = dateTime;
    }
}
