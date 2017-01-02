package cn.zmlio.tinycms2.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zml on 2017/1/1.
 */
@Entity
@Table(name = "cms_attachment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Attachment extends AbstractEntity{

    private String originName;

    private String url;

    private String fileLength;

    private String groupFlag;

    private String savePath;

    private String fileKey;
}
