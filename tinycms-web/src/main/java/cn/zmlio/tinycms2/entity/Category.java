package cn.zmlio.tinycms2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 文章类目
 * Created by zml on 2017/1/4.
 */
@Entity
@Table(name = "cms_category")
@Data
public class Category {
    @Column(name = "category_name")
    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "parent_id")
    private Category superCategory;

    @OneToMany(mappedBy = "superCategory",fetch = FetchType.LAZY)
    private List<Category> subCategories;

    @Column(name = "category_code",length = 32)
    private String categoryCode;
}
