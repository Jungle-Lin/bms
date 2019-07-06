package top.lin.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.login.entity.SystemUser;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:54
 */
public interface LoginDao extends JpaRepository<SystemUser, Integer> {

    SystemUser findSystemUserByAccount(String account);
}
