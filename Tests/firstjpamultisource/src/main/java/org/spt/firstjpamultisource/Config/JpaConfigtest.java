package org.spt.firstjpamultisource.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
         basePackages = "org.spt.firstjpamultisource.Dao.test"
        ,entityManagerFactoryRef = "localContainerEntityManagerFactoryBeantest"
        ,transactionManagerRef = "platformTransactionManagertest")
public class JpaConfigtest {
    @Autowired
    @Qualifier(value = "dstest")
    DataSource dstest;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeantest(EntityManagerFactoryBuilder builder){
        return builder.dataSource(dstest)
                .packages("org.spt.firstjpamultisource.Model.test")
                .properties(jpaProperties.getProperties())
                .persistenceUnit("pu2")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManagertest(EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean factoryBeanvhr = localContainerEntityManagerFactoryBeantest(builder);
        return new JpaTransactionManager(factoryBeanvhr.getObject());
    }

}
