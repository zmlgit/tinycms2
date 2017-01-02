package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by zml on 2016/12/31.
 */
@Builder
@Data
@Entity
@Table(name = "cms_role")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Role extends AbstractEntity {

    private String roleName;

    private String roleCode;

    @Singular("addPerm")
    @ManyToMany(targetEntity = Permission.class,fetch = FetchType.LAZY)
    @JoinTable(name = "cms_role_perm",joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "perm_id"))
    private Set<Permission> permissions;

}
