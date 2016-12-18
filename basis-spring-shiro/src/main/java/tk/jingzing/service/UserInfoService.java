package tk.jingzing.service;

import tk.jingzing.bean.UserInfo;

/**
 * Created by wangyunjing on 2016/12/16.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
