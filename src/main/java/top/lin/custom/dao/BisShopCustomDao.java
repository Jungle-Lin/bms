package top.lin.custom.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface BisShopCustomDao {

    @Autowired
    public BisShopCustomDao bisshopcustom();
}
