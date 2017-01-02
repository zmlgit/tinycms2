package cn.zmlio.tinycms2.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by zml on 2016/12/31.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
public abstract class AbstractEntity {

    @Id
    @Column(name = "id", length = 36)
    private String id= UUID.randomUUID().toString();

    private Date createTime = new Date();

    private Date updateTime =new Date();

    @Column(length = 40)
    private String updateUser;

    @Column(length = 40)
    private String createUser;

    private boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public AbstractEntity() {
    }
}
