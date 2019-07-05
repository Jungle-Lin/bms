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
  private Date entryDate;
  private String mobile;
  private String phone;
  private String email;
  private Date bornDate;
  private String idno;
  private String address;
  private String linkman;
  private String linkphone;
  private String status;
  private String isDel;
  private String remark;
  private Date createTime;
  private String createUserId;
  private Date modifyTime;
  private String modifyUserId;

}
