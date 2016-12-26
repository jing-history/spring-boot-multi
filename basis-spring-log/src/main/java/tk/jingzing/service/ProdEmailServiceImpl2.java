package tk.jingzing.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by wangyunjing on 2016/12/26.
 */
@Service
@Profile("prod") //生产环境.
public class ProdEmailServiceImpl2 implements EmailService{
    @Override
    public void send() {
        System.out.println("DevEmailServiceImpl.send().生产环境执行邮件的发送.");
        //具体的邮件发送代码.
        //mail.send();
    }
}
