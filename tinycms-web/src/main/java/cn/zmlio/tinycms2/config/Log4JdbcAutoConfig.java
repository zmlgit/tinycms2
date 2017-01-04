package cn.zmlio.tinycms2.config;

import net.sf.log4jdbc.DataSourceSpyInterceptor;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
import javax.annotation.Resource;

/**
 * Created by zml on 2017/1/3.
 */
@Configuration
public class Log4JdbcAutoConfig {

    @Bean(name = "dataSourceSpyInterceptor")
    public DataSourceSpyInterceptor dataSourceSpyInterceptor(){
        return new DataSourceSpyInterceptor();
    }

    @Bean
    @ConditionalOnBean(name = "dataSource")
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
        BeanNameAutoProxyCreator beanNameAutoProxyCreator=new BeanNameAutoProxyCreator();
        beanNameAutoProxyCreator.setInterceptorNames("dataSourceSpyInterceptor");
        beanNameAutoProxyCreator.setBeanNames("dataSource");
        return beanNameAutoProxyCreator;
    }
}
