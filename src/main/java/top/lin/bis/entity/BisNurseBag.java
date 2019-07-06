package top.lin.bis.entity;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Type
 * @Author ysj
 * @Date 2019/7/5
 */
@Data
public class BisNurseBag {
    private String bgaId;
    private String bagName;
    private Double bagTotalPrice;
    private String coverPhoto;
    private String coverBigPhoto;
    private Integer openCardNum;
    private Integer remainNum;
    private Integer maxBuyNum;
    private Integer minBuyNum;
    private String putawayTime;

    public void setPutawayTime(Date putawayTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(putawayTime);
        this.putawayTime = dateTime;
    }
}
