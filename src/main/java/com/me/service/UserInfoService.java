package com.me.service;

import com.me.pojo.UserInfo;
import com.me.vo.UserInfoVo;

import java.util.List;

/**
 * 查询用户信息、修改用户信息用
 */
public interface UserInfoService {

    /**
     * 登录
     * @param user
     * @param password
     * @return
     */
    UserInfo login(String user, String password);


    /**
     * 用户管理用户列表展示
     * @return
     */
    List<UserInfoVo> selectUserInfo();



}
