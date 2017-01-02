package cn.zmlio.tinycms2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zml on 2017/1/1.
 */
@EnableAutoConfiguration
@EntityScan(basePackages = "cn.zmlio.tinycms2.entity")
@Configuration
@ComponentScan(basePackages = "cn.zmlio.tinycms2")
public class ApplicationEntry {
}
