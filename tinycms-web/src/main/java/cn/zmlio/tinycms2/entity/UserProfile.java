package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by zml on 2017/1/1.
 */
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "cms_user_profile")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile extends AbstractEntity {

    private String realName;

    private String wechat;

    private String qq;

    private String weibo;

    private String address;

    @ManyToOne(targetEntity = District.class)
    @JoinColumn(name = "district_id")
    private District district;

    @OneToOne(targetEntity = Attachment.class)
    @JoinColumn(name = "avatar_id")
    private Attachment avatar;
}
