package tk.jingzing.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by wangyunjing on 2016/12/26.
 */
@Service
@Profile("dev") //开发环境的时候.
public class DevEmailServiceImpl implements EmailService {
    @Override
    public void send() {
        System.out.println("DevEmailServiceImpl.send().开发环境不执行邮件的发送.");

    }
}
