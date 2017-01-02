package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zml on 2016/12/31.
 */
@Data
@Builder
@Entity
@Table(name = "cms_social_account")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class SocialAccount extends AbstractEntity {

    private String type;

    private String userId;

    private String token;

    private Long expired;
}
