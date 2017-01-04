package cn.zmlio.tinycms2.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zml on 2017/1/4.
 */
@Entity
@Table(name = "cms_website")
@Data
public class WebSite extends AbstractEntity {

    @Column(unique = true)
    private String domain;

    @Column(unique = true, name = "index_url")
    private String indexUrl;

    private int port = 80;
    @Column(name = "resource_path")
    private String resourcePath;

    @Column(name = "website_name")
    private String websiteName;

}
