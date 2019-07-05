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
public class BisShopPost {

  private String postId;
  private String postName;
  private String postCode;
  private String postDesc;
  private Date createTime;
  private String createUserId;
  private Date modifyTime;
  private String modifyUserId;

}
