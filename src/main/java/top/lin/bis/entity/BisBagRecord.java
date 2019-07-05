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
public class BisBagRecord {
    private String recordId;
    private String bagId;
    private Integer validDay;
    private String customUserId;
    private Integer buyNum;
    private String recevieUserId;
    private Integer shareNum;
    private String createTime;
    private String orderId;
    private String shareTime;
    private String shareUserId;
    private String bagTime;
    private String recordType;
    private String status;
    private String receiveStatus;

    public void setCreateTime(Date createTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(createTime).toString();
        this.createTime = dateTime;
    }


    public void setShareTime(Date shareTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(shareTime).toString();
        this.shareTime = dateTime;
    }

    public void setBagTime(Date bagTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(bagTime).toString();
        this.bagTime = dateTime;
    }
}
