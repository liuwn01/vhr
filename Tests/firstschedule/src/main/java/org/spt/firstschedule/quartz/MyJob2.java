package org.spt.firstschedule.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;


public class MyJob2 extends QuartzJobBean {
    HelloService helloService;

    public HelloService getHs() {
        return helloService;
    }

    public void setHs(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        helloService.sayhello();
    }
}


