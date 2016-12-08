package tk.jingzing.demo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangyunjing on 2016/12/8.
 */
@Service
public class DemoService {

    @Resource
    private DemoDao demoDao;

    public Demo getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }
}
