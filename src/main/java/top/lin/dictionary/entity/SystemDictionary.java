package top.lin.dictionary.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 20:00
 */
@Entity
@Table(name = "sys_dictionary_index")
@Data
public class SystemDictionary {

    @Column(name = "dic_index_id")
    private String dicIndexId;

    @Column(name = "dic_key")
    private String dicKey;

    @Column(name = "dic_name")
    private String dicName;

    @Column(name = "catalog_id")
    private String catalogId;

    @Column(name = "catalog_cascade_id")
    private String catalogCascadeId;

    @Column(name = "dic_remark")
    private String dicRemark;

    @Column(name = "create_name")
    private String createTime;

    @Column(name = "create_user_id")
    private String createUserId;

    @Column(name = "modify_time")
    private String modifyTime;

    @Column(name = "modify_user_id")
    private String modifyUserId;
}
