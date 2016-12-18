package tk.jingzing.base;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.jingzing.core.Shanhy;
import tk.jingzing.service.HelloService;

/**
 * Created by wangyunjing on 2016/12/18.
 */
@Configuration
public class MyConfig {
    /**
     *  这里只是测试使用，没有实际的意义.
     */
    @Bean(name="testHelloService")
    public HelloService filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy){
        HelloService helloService = new HelloService();
        shanhy.dispaly();
        // 其它处理代码.
        return helloService;
    }
}
