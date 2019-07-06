package top.lin.bis.entity;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Type 美颜币基础设置类
 * @Author ysj
 * @Date 2019/7/5
 */
@Data
public class BisBeautyConfig {
    private Integer buyNum;
    private Integer giveNum;
    private Integer isDel;
    private String createTime;
    private String createUserId;
    private String modifyTime;
    private String modifyUserId;
    private String remark;

    /**
     * 时间格式化
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(createTime);
        this.createTime = dateTime;
    }

    public void setModifyTime(Date modifyTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(modifyTime);
        this.modifyTime = dateTime;
    }
}
