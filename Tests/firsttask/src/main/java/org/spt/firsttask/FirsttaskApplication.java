package org.spt.firsttask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirsttaskApplication {

    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("FirsttaskApplication");
        for (String a: args) {
            System.out.println(a);
        }
        SpringApplication.run(FirsttaskApplication.class, args);
    }

}
