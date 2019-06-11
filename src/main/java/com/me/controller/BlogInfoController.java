package com.me.controller;

import com.me.pojo.BlogInfo;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Lee
 * @date 2019-06-11 10:36
 */
@Controller
public class BlogInfoController {
    @Autowired
    BlogInfoService blogInfoService;

    /**
     * 展示所有博客信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectBlogInfo",method = RequestMethod.POST)
    public Object selectBlogInfo(){
        WZCZVo wzczVo = blogInfoService.selectBlogInfo();
        System.out.println(wzczVo);
        return wzczVo;
    }

}
