package org.spt.firstschedule.quartz;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyJob1 {
    public void sayHello(){
        System.out.println("sayHello>>>" + new Date());
    }
}
