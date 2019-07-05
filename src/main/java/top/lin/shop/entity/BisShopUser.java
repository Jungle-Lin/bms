package top.lin.shop.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class BisShopUser {

  private String shopUserId;
  private String userType;
  private String shopId;
  private String account;
  private String username;
  private String password;
  private String photo;
  private String workNumber;
  private String sex;
  private String postCode;
  private java.sql.Date entryDate;
  private String mobile;
  private String phone;
  private String email;
  private java.sql.Date bornDate;
  private String idno;
  private String address;
  private String linkman;
  private String linkphone;
  private String status;
  private String isDel;
  private String remark;
  private java.sql.Timestamp createTime;
  private String createUserId;
  private java.sql.Timestamp modifyTime;
  private String modifyUserId;

}
