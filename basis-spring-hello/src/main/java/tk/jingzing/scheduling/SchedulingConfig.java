package tk.jingzing.scheduling;

import org.springframework.context.annotation.Configuration;

/**
 * 定时任务
 * Created by wangyunjing on 2016/12/8.
 */
@Configuration
//@EnableScheduling
public class SchedulingConfig {

   // @Scheduled(cron = "0/20 * * * * ?")
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}
