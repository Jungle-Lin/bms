package top.lin.shop.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BisShopPost {

  private String postId;
  private String postName;
  private String postCode;
  private String postDesc;
  private java.sql.Timestamp createTime;
  private String createUserId;
  private java.sql.Timestamp modifyTime;
  private String modifyUserId;

}
