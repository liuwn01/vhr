##定时任务
#方法一 Scheduled
1.在@SpringBootApplication下添加@EnableScheduling
2.在其他组件在使用@Scheduled

#方法二 quartz
1.在@SpringBootApplication下添加@EnableScheduling
2. jobDetail(要做的事情) + 触发器(什么时候做)
    2.1 方式一(此方法无法传递参数): 
        定义@Component/Bean 
    2.2 方法二(可传递参数)
        继承QuartzJobBean(此时无需添加@Component/Bean等注解)
    2.3 定义JobDetails(MethodInvokingJobDetailFactoryBean/JobDetailFactoryBean)
    2.4 Trigger(SimpleTriggerFactoryBean/CronTriggerFactoryBean)












