package com.me.controller;

import com.me.pojo.BlogInfo;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("selectBlogInfo")
    public Object selectBlogInfo() {
        List<WZCZVo> wzczVos = blogInfoService.selectBlogInfo();
        return wzczVos;
    }

    /**
     * 修改页根据blog_id回显
     *
     * @param blog_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getBlogInfoById")
    public Object getBlogInfoById(@RequestParam int blog_id) {
        return blogInfoService.getBlogInfoById(blog_id);
    }

    /**
     * 修改页根据blog_id修改文章
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("updateBlogInfoById")
    public Object updateBlogInfoById(@RequestBody BlogInfo blogInfo) {
        int i = blogInfoService.updateBlogInfoById(blogInfo);
        System.out.println(i);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据blog_id删除文章
     * @param blog_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteBlogInfoById")
    public Object deleteBlogInfoById(@RequestParam int blog_id){
        int i = blogInfoService.deleteBlogInfoById(blog_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }
}
