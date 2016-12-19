package tk.jingzing.web;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.jingzing.bean.Demo;
import tk.jingzing.service.DemoService;

import java.util.List;

/**
 * Created by wangyunjing on 2016/12/19.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        PageHelper.startPage(1,1);
        return demoService.likeName(name);
    }
}
