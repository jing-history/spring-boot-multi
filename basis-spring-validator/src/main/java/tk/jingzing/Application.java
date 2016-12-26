package tk.jingzing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot集成EHCache实现缓存机制【从零开始学Spring Boot】
 * http://412887952-qq-com.iteye.com/blog/2294952
 * http://www.tuicool.com/articles/6RzUZva
 * Created by wangyunjing on 2016/12/7.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        /*String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }
}
