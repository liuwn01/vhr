package org.spt.firsttask.Scripts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(100)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------------");
        System.out.println("MyCommandLineRunner1:");
        for (String a: args) {
            System.out.println(a);
        }

    }
}
