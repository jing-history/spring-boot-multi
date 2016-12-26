package tk.jingzing.service;

/**
 * http://412887952-qq-com.iteye.com/blog/2307104
 * 多环境高级应用  发送邮件接口.
 *      在某些情况下，应用的某些业务逻辑可能需要有不同的实现。例如邮件服务，
 *      假设EmailService中包含的send(String email)方法向指定地址发送电子邮件，
 *      但是我们仅仅希望在生产环境中才执行真正发送邮件的代码，而开发环境里则不发送以免向用户发送无意义的垃圾邮件。
 * Created by wangyunjing on 2016/12/26.
 */
public interface EmailService {
    /**发送邮件*/
    public void send();
}
