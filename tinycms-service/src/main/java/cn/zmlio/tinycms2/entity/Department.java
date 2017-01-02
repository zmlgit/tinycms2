package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * 部门表，树状结构
 * Created by zml on 2016/12/31.
 */
@Data
@Builder
@Entity
@Table(name = "cms_department")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Department extends AbstractEntity {
    private String deptName;

    private String comment;

    private String deptCode;

    @ManyToOne(targetEntity = Department.class,cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Department parent;

    @OneToMany(mappedBy = "parent",fetch = FetchType.LAZY)
    @Singular("addSubDepartment")
    private List<Department> subDepartments;

}
