package tk.jingzing.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tk.jingzing.Application;

/**
 * Created by wangyunjing on 2016/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(Application.class)
public class DemoDaoTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void getById() throws Exception {
        Demo demo = demoService.getById(1);
        Assert.assertEquals("test1",demo.getUserName());
    }
}