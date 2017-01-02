package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by zml on 2016/12/31.
 */
@Data
@Builder
@Entity
@Table(name = "cms_user",indexes = {@Index(columnList = "userName,phone,email")})
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class User extends AbstractEntity{

    @Column(length = 32,unique = true,nullable = false)
    private String userName;

    @Column(length = 32)
    private String nickName;

    @Column(length = 20)
    private String phone;

    @Column(length = 64,unique = true)
    private String email;

    @Column(length = 40)
    private String password;

    @Column(length = 64)
    private Byte[] encrypt;

    @ManyToMany(targetEntity = Role.class)
    @JoinTable(name = "cms_user_role",joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;
}
