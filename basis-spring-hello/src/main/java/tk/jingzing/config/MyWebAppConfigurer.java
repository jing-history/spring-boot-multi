package tk.jingzing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * http://412887952-qq-com.iteye.com/blog/2292098
 * （13）处理静态资源（自定义资源映射）【从零开始学Spring Boot】
 * Created by wangyunjing on 2016/12/8.
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        super.addResourceHandlers(registry);
        super.addResourceHandlers(registry);
    }
}
