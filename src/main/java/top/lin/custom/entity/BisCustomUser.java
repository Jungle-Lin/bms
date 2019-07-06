package top.lin.custom.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Data
@Getter
@Setter
@Component
public class BisCustomUser {

  private String customUserId;
  private String mobile;
  private String username;
  private String password;
  private String nikename;
  private String openid;
  private String unionid;
  private String wechat;
  private String photo;
  private String sex;
  private String phone;
  private String qq;
  private String email;
  private Date bornDate;
  private String idno;
  private String address;
  private String remark;
  private String enrollMode;
  private Date enrollTime;
  private String isDel;
  private String wechatStatus;
  private long beautyNum;
  private long bagNum;
  private BisShopCustom bisShopCustom;

  @Override
  public String toString() {
    return "BisCustomUser{" +
            "customUserId='" + customUserId + '\'' +
            ", mobile='" + mobile + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", nikename='" + nikename + '\'' +
            ", openid='" + openid + '\'' +
            ", unionid='" + unionid + '\'' +
            ", wechat='" + wechat + '\'' +
            ", photo='" + photo + '\'' +
            ", sex='" + sex + '\'' +
            ", phone='" + phone + '\'' +
            ", qq='" + qq + '\'' +
            ", email='" + email + '\'' +
            ", bornDate=" + bornDate +
            ", idno='" + idno + '\'' +
            ", address='" + address + '\'' +
            ", remark='" + remark + '\'' +
            ", enrollMode='" + enrollMode + '\'' +
            ", enrollTime=" + enrollTime +
            ", isDel='" + isDel + '\'' +
            ", wechatStatus='" + wechatStatus + '\'' +
            ", beautyNum=" + beautyNum +
            ", bagNum=" + bagNum +
            ", bisShopCustom=" + bisShopCustom +
            '}';
  }
}
