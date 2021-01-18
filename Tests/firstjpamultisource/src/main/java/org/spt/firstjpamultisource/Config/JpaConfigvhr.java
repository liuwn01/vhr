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

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
         basePackages = "org.spt.firstjpamultisource.Dao.vhr"
        ,entityManagerFactoryRef = "localContainerEntityManagerFactoryBeanvhr"
        ,transactionManagerRef = "platformTransactionManagervhr")
public class JpaConfigvhr {
    @Autowired
    @Qualifier(value = "dsvhr")
    DataSource dsvhr;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeanvhr(EntityManagerFactoryBuilder builder){
        return builder.dataSource(dsvhr)
                .packages("org.spt.firstjpamultisource.Model.vhr")
                .properties(jpaProperties.getProperties())
                .persistenceUnit("pu1")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManagervhr(EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean factoryBeanvhr = localContainerEntityManagerFactoryBeanvhr(builder);
        return new JpaTransactionManager(factoryBeanvhr.getObject());
    }

}
