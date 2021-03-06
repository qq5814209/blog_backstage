package com.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.me.pojo.UserInfo;
import com.me.service.UserInfoService;
import com.me.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 查询用户信息、修改用户信息用controller
 */
@Controller
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    /**
     * 登录
     *
     * @param user
     * @param password
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "userLogin", method = RequestMethod.POST)
    public Object login(String user, String password, HttpSession session) {
        UserInfo userInfo = userInfoService.login(user, password);
        session.setAttribute("userInfo", userInfo);
        return userInfo;
    }

    /**
     * 判断是否登录
     *
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "islogin", method = RequestMethod.GET)
    public Object islogin(HttpSession session) {
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        return userInfo;
    }

    /**
     * 用户管理用户列表展示
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("selectUserInfo")
    public Object selectUserInfo(@RequestBody UserInfoVo userInfoVo) {
        PageHelper.startPage(userInfoVo.getCurrentPage(), userInfoVo.getPageSize());
        List<UserInfoVo> userInfoVos = userInfoService.selectUserInfo();
        PageInfo<UserInfoVo> userInfoVoPageInfo = new PageInfo<UserInfoVo>(userInfoVos);
        return userInfoVoPageInfo;
    }

    /**
     * 修改页根据user_id回显
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int user_id) {
        return userInfoService.getUserInfoById(user_id);
    }

    /**
     * 修改页根据user_id修改用户
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("updateUserInfo")
    public Object updateUserInfo(@RequestBody UserInfo userInfo) {
        int i = userInfoService.updateUserInfoById(userInfo);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据user_id删除用户
     * @param user_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteUserInfoById")
    public Object deleteUserInfoById(@RequestParam int user_id) {
        int i = userInfoService.deleteUserInfoById(user_id);
        if (i != 0) {
            return true;
        } else {
            return false;
        }
    }
}















