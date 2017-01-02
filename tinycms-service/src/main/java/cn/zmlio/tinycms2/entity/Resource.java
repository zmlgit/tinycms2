package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zml on 2016/12/31.
 */
@Builder
@Data
@Entity
@Table(name = "cms_resources")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Resource extends AbstractEntity{

    private String resourceName;

    private String resource_code;

    private String url;

}
