package cn.zmlio.tinycms2.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by zml on 2017/1/4.
 */
@Entity
@Table(name = "cms_article")
@Data
public class Article extends AbstractEntity {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meta_id")
    private ContentMeta meta;

    @Column(name = "content")
    @Lob
    private String content;//文章具体内容

}