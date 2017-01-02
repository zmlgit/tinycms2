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
@Table(name = "cms_permission")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Permission extends AbstractEntity{

    private String permName;

    private String permCode;

    @ManyToMany(targetEntity = Resource.class,fetch = FetchType.LAZY)
    @JoinTable(name = "cms_perm_resource",joinColumns = @JoinColumn(name = "perm_id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id"))
    private Set<Resource> resources;


}
