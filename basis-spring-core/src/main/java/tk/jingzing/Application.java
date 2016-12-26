package tk.jingzing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * http://www.tuicool.com/articles/6RzUZva
 * Created by wangyunjing on 2016/12/7.
 */
@SpringBootApplication
@EnableAsync
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /*String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }
}
