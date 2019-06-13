package com.me.controller;

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
        System.out.println(user + " : " + password);
        UserInfo userInfo = userInfoService.login(user, password);
        System.out.println(userInfo);
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
        System.out.println(userInfo);
        return userInfo;
    }

    /**
     * 用户管理用户列表展示
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("selectUserInfo")
    public Object selectUserInfo() {
        List<UserInfoVo> userInfoVos = userInfoService.selectUserInfo();
        return userInfoVos;
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
        System.out.println(i);
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















