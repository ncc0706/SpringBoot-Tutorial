package com.xlinyu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gavin on 18/09/2016.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    // 每20秒执行一次
    @Scheduled(cron = "0/20 * * * * ?")
    public void scheduler() {
        /**
         * >>>>>>>>> SchedulingConfig.scheduler()2016-09-18 16:23:40
         * >>>>>>>>> SchedulingConfig.scheduler()2016-09-18 16:24:00
         * >>>>>>>>> SchedulingConfig.scheduler()2016-09-18 16:24:20
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()--" + sdf.format(new Date()));
    }
}
