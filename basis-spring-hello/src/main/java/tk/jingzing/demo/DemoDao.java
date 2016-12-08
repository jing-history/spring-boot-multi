package tk.jingzing.demo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 使用JdbcTemplate操作数据库.
 * Created by wangyunjing on 2016/12/8.
 */
@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id获取demo对象.
     * @param id
     * @return
     */
    public Demo getById(long id){
        String sql = "select * from user_info where id= ?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
}
