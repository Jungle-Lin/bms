package top.lin.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class BisShop {

  //店铺编号
  private String shopId;
  //关联BisShopUser中的shopUserId
  private String ownerId;
  private String shopName;
  private String shortName;
  private double monthCashIn;
  private double monthExpendIn;
  private String shopLicense;
  private String shopImage;
  private String shopDetailImage;
  private double gpsX;
  private double gpsY;
  private long sortNo;
  private String shopAddress;
  private String shopQrcode;
  private String shopPhone;
  private double shopArea;
  private String shopProject;
  private String shopType;
  private String shopIntro;
  private String showStatus;
  private String isDel;
  private String shopRemark;
  private String beginTime;
  private String endTime;
  private Date createTime;
  private String createUserId;
  private Date modifyTime;
  private String modifyUserId;

}
