package cn.zmlio.tinycms2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zml on 2017/1/4.
 */
@Entity
@Table(name = "cms_content_meta")
@Data
public class ContentMeta extends AbstractEntity {

    @Column(name = "audit_state")
    private int auditState;//审核状态

    @Column(name = "audit_time")
    private Date auditTime;//审核时间

    private int source;//文章来源

    private String origin;//转载于xxx

    private int reader;//阅读量

    private int favour;//赞成数

    private int opponent;//反对数

    @OneToOne(mappedBy = "meta", cascade = CascadeType.MERGE)
    private Article article;

}

