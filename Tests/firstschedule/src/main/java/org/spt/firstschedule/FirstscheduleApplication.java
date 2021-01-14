package org.spt.firstschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FirstscheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstscheduleApplication.class, args);
    }

}
