package top.lin.bis.entity;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Type 礼包记录
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

    /**
     * 时间格式化
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(createTime).toString();
        this.createTime = dateTime;
    }

    /**
     * @param shareTime
     */
    public void setShareTime(Date shareTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(shareTime).toString();
        this.shareTime = dateTime;
    }

    /**
     * @param bagTime
     */
    public void setBagTime(Date bagTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(bagTime).toString();
        this.bagTime = dateTime;
    }
}
