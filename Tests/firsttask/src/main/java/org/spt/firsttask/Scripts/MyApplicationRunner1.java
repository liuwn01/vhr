package org.spt.firsttask.Scripts;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Component
@Order(98)
public class MyApplicationRunner1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("MyApplicationRunner1>>>" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String key: optionNames) {
            System.out.println(key + "      " + args.getOptionValues(key));
        }
        String [] sourceArgs = args.getSourceArgs();
        System.out.println(Arrays.toString(sourceArgs));



    }
}
