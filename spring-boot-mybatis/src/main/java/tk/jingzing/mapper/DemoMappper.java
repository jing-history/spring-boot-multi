package tk.jingzing.mapper;

import org.apache.ibatis.annotations.Select;
import tk.jingzing.bean.Demo;

import java.util.List;

/**
 * Created by wangyunjing on 2016/12/19.
 */
public interface DemoMappper {

    @Select("select *from Demo where name = #{name}")
    public List<Demo> likeName(String name);

    @Select("select *from Demo where id = #{id}")
    public Demo getById(long id);

    @Select("select name from Demo where id = #{id}")
    public String getNameById(long id);

}
