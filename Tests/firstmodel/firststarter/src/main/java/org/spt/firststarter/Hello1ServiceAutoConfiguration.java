package org.spt.firststarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Hello1Properties.class)
@ConditionalOnClass(HelloService.class)
public class Hello1ServiceAutoConfiguration {
    @Autowired
    Hello1Properties hello1Properties;

    @Bean
    HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setName(hello1Properties.getName());
        helloService.setMsg(hello1Properties.getMsg());
        return helloService;
    }


}
