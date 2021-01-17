package org.spt.firstjdbctemp.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    //@Primary
    @Bean(value = "dsone")
    @ConfigurationProperties(prefix = "spring.datasource.druid.one")
    DataSource dsone(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(value = "dstwo")
    @ConfigurationProperties(prefix = "spring.datasource.druid.two")
    DataSource dstwo(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(value = "ds3th")
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource ds3th(){
        return DruidDataSourceBuilder.create().build();
    }
}
