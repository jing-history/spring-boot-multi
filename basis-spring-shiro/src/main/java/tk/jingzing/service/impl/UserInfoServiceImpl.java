package tk.jingzing.service.impl;

import org.springframework.stereotype.Service;
import tk.jingzing.bean.UserInfo;
import tk.jingzing.repository.UserInfoRepository;
import tk.jingzing.service.UserInfoService;

import javax.annotation.Resource;

/**
 * Created by wangyunjing on 2016/12/16.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }
}
