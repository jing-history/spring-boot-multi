package tk.jingzing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.jingzing.bean.Demo;
import tk.jingzing.mapper.DemoMappper;

import java.util.List;

/**
 * Created by wangyunjing on 2016/12/19.
 */
@Service
public class DemoService {
    @Autowired
    private DemoMappper demoMappper;

    public List<Demo> likeName(String name){
        return demoMappper.likeName(name);
    }
}
