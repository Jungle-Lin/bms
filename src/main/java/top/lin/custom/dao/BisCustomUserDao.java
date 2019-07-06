package top.lin.custom.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import top.lin.custom.entity.BisCustomUser;

import java.util.List;

@Mapper
public interface BisCustomUserDao {

    @Autowired
    public List<BisCustomUser> biscustomuser();
}
