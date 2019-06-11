package com.me.mapper;

import com.me.pojo.UserInfo;
import com.me.vo.UserInfoVo;

import java.util.List;

/**
 * 操作 userInfo 表
 */
public interface UserInfoMapper {

    /**
     * 登录
     * @param userInfo
     * @return
     */
    UserInfo login(UserInfo userInfo);

    /**
     * 用户管理用户列表展示
     * @return
     */
    List<UserInfoVo> selectUserInfo();


}
