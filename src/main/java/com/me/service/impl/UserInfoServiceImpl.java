package com.me.service.impl;

import com.me.mapper.UserInfoMapper;
import com.me.pojo.UserInfo;
import com.me.service.UserInfoService;
import com.me.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询用户信息、修改用户信息用
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * 登录
     * @param user
     * @param password
     * @return
     */
    public UserInfo login(String user, String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name(user);
        userInfo.setPassword(password);
        return userInfoMapper.login(userInfo);
    }

    /**
     * 用户管理用户列表展示
     * @return
     */
    public List<UserInfoVo> selectUserInfo() {
        return userInfoMapper.selectUserInfo();
    }

    /**
     * 修改页根据user_id回显
     * @param user_id
     * @return
     */
    public Object getUserInfoById(int user_id) {
        return userInfoMapper.getUserInfoById(user_id);
    }

    /**
     * 修改页根据user_id修改用户
     * @param userInfo
     * @return
     */
    public int updateUserInfoById(UserInfo userInfo) {
        int i =userInfoMapper.updateUserInfoById(userInfo);
        return i;
    }

    /**
     * 根据user_id删除用户
     * @param user_id
     * @return
     */
    public int deleteUserInfoById(int user_id) {
        return userInfoMapper.deleteUserInfoById(user_id);
    }
}
