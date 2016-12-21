package tk.jingzing.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现Web层的日志切面
 * Created by wangyunjing on 2016/12/19.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name,int state){
        return"name "+name+"---"+state;
    }
}

