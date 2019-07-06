package top.lin.login.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 10:54
 */
@Entity
@Table(name = "sys_user")
@Data
@DynamicUpdate
@DynamicInsert
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private String account;

    private String password;

    private String username;

    @Column(name = "lock_num")
    private Integer lockNum;

    @Column(name = "error_num")
    private Integer errorNum;

    private String sex;

    private String status;

    @Column(name = "user_type")
    private String userType;

    //todo dept

    private String mobile;
    private String qq;
    private String wechat;
    private String email;
    private String idno;
    private String style;
    private String address;
    private String remark;

    @Column(name = "is_del")
    private String isDel;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "create_user_id")
    private String createUserId;

    @Column(name = "modify_time")
    private String modifyTime;

    @Column(name = "modify_user_id")
    private String modifyUserId;
}
