package top.lin.custom.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import top.lin.shop.entity.BisShopUser;

import java.util.Date;
import java.util.List;

@Component
//@Data
@Getter
@Setter
public class BisShopCustom {

  private String customUserId;
  private String shopId;
  private Date recentTime;
  private Date createTime;
  private List<BisShopUser> bisShopUser;

  @Override
  public String toString() {
    return "BisShopCustom{" +
            "customUserId='" + customUserId + '\'' +
            ", shopId='" + shopId + '\'' +
            ", recentTime=" + recentTime +
            ", createTime=" + createTime +
            ", bisShopUser=" + bisShopUser +
            '}';
  }
}
