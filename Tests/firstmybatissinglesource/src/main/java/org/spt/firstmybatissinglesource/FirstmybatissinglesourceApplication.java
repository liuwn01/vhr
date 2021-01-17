package org.spt.firstmybatissinglesource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.spt.firstmybatissinglesource.Mapper")
public class FirstmybatissinglesourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstmybatissinglesourceApplication.class, args);
    }

}
