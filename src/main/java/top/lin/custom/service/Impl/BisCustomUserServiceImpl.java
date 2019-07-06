package top.lin.custom.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.custom.dao.BisCustomUserDao;
import top.lin.custom.entity.BisCustomUser;
import top.lin.custom.service.BisCustomUserService;

import java.util.List;

@Service
public class BisCustomUserServiceImpl implements BisCustomUserService {
    @Autowired
    private BisCustomUserDao bisCustomUserDao;


    @Override
    public List<BisCustomUser> biscustomuser() {
        return bisCustomUserDao.biscustomuser();
    }
}
