package org.spt.firstmybatismultisource.Config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "org.spt.firstmybatismultisource.Mapper.test"
        , sqlSessionFactoryRef = "sqlSessionFactorytest"
        , sqlSessionTemplateRef = "sqlSessionTemplatetest")
public class MyBatisConfigtest {
    @Autowired
    @Qualifier("dstest")
    DataSource dstest;

    @Bean
    SqlSessionFactory sqlSessionFactorytest() {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dstest);
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplatetest() {
        return new SqlSessionTemplate(sqlSessionFactorytest());
    }

}
