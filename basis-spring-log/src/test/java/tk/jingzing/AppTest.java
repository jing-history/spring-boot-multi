package tk.jingzing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.jingzing.config.BlogProperties2;

/**
 * Created by wangyunjing on 2016/12/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AppTest {

    @Autowired
    private BlogProperties2 blogProperties;

    @Test
    public void testBlog() throws Exception {
        System.out.println("AppTest.testBlog()="+blogProperties);
        Assert.assertEquals("Angel",blogProperties.getName());
        Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());
    }
}
