package tk.jingzing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import tk.jingzing.config.BlogProperties2;

/**
 * Spring Boot日志升级篇—log4j【从零开始学Spring Boot】
 * http://412887952-qq-com.iteye.com/blog/2306974
 * Created by wangyunjing on 2016/12/7.
 */
@SpringBootApplication
@EnableConfigurationProperties({BlogProperties2.class})
/*
 * @ActiveProfiles，可以指定一个或者多个 profile，
 * 这样我们的测试类就仅仅加载这些名字的 profile 中定义的 bean 实例。
 * 这里激活application-prod.properties配置文件.
 */
//@ActiveProfiles("prod")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
