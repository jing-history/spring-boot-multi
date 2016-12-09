package tk.jingzing.config;

/**
 * http://412887952-qq-com.iteye.com/blog/2292362
 * druid数据源状态监控
 * 以上配置的监控方式是使用了原生的servlet，filter方式，然后通过@ServletComponentScan进行启动扫描包的方式进行处理的，你会发现我们的servlet，filter根本没有任何的编码。
 * Created by wangyunjing on 2016/12/9.
 */
/*@WebServlet(
        urlPatterns = "/druid*//*",
        initParams = {
                @WebInitParam(name="allow",value="127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name="deny",value="192.168.1.73"),// IP黑名单 (存在共同时，deny优先于allow)
                @WebInitParam(name="loginUsername",value="admin"),// 用户名
                @WebInitParam(name="loginPassword",value="123456"),// 密码
                @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
        }
)
public class DruidStatViewServlet extends StatViewServlet{
}*/
public class DruidStatViewServlet{

}
