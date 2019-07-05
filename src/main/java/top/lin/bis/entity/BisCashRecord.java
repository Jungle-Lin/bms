package top.lin.bis.entity;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    public void setPayTime(Date payTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(payTime);
        this.payTime = dateTime;
    }
}
