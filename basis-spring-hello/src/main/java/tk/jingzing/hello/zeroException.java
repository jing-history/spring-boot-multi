package tk.jingzing.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangyunjing on 2016/12/8.
 */
@Controller
@RequestMapping("/zeroException")
public class zeroException {
    public int zeroException(){
        return 100/0;
    }
}
