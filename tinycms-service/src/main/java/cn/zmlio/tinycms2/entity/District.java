package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by zml on 2017/1/1.
 */
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "cms_district")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class District extends AbstractEntity {

    @Column(length = 32)
    private String distName;

    @Column(length = 20)
    private String distCode;

    @Column(length = 20)
    private String distPost;

    @Column(length = 2)
    private int level;

    private boolean leaf;

    @ManyToOne(targetEntity = District.class,fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    @JoinColumn(name = "parent_id")
    private District parent;

    @OneToMany(mappedBy = "parent",fetch = FetchType.LAZY)
    @Singular("add")
    private Set<District> subDistricts;
}
