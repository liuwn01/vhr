package org.spt.firstjdbctemp.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateConfig {

    @Bean
    JdbcTemplate jdbcTemplateOne(@Qualifier("dsone") DataSource dsone){
        return new JdbcTemplate(dsone);
    }

    @Bean
    JdbcTemplate jdbcTemplateTwo(@Qualifier("dstwo") DataSource dstwo){
        return new JdbcTemplate(dstwo);
    }

    @Bean
    JdbcTemplate jdbcTemplate3th(@Qualifier("ds3th") DataSource ds3th){
        return new JdbcTemplate(ds3th);
    }

}
