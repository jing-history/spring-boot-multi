package tk.jingzing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wangyunjing on 2016/12/26.
 */
@ConfigurationProperties(prefix="com.kfit.blog")
public class BlogProperties2 {

    private String name;//博客作者

    private String title;//博客标

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
