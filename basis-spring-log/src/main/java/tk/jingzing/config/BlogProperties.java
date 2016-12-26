package tk.jingzing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wangyunjing on 2016/12/26.
 */
@Component
public class BlogProperties {
    @Value("${com.kfit.blog.name}")
    private String name;//博客作者

    @Value("${com.kfit.blog.title}")
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
