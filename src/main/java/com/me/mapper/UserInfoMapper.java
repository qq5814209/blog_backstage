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


    /**
     * 修改页根据user_id回显
     * @param user_id
     * @return
     */
    UserInfo getUserInfoById(int user_id);

    /**
     * 修改页根据user_id修改用户
     * @param userInfo
     * @return
     */
    int updateUserInfoById(UserInfo userInfo);

    /**
     * 根据user_id删除用户
     * @param user_id
     * @return
     */
    int deleteUserInfoById(int user_id);
}
