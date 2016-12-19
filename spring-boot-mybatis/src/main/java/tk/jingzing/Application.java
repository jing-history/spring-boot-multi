package tk.jingzing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot集成EHCache实现缓存机制【从零开始学Spring Boot】
 * http://412887952-qq-com.iteye.com/blog/2294952
 * http://www.tuicool.com/articles/6RzUZva
 * Created by wangyunjing on 2016/12/7.
 */
@SpringBootApplication
@MapperScan("tk.*.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
