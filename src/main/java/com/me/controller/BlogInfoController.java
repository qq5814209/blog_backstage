package com.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.me.pojo.BlogInfo;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
import com.me.vo.WZSHVo;
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
    public Object selectBlogInfo(@RequestBody WZCZVo wzczVo) {
        PageHelper.startPage(wzczVo.getCurrentPage(), wzczVo.getPageSize());
        List<WZCZVo> wzczVos = blogInfoService.selectBlogInfo();
        PageInfo<WZCZVo> wzczPageInfo = new PageInfo<WZCZVo>(wzczVos);
        return wzczPageInfo;
    }
    /**
     * 查询所有博客信息审核状态
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("selectAuditBlogInfo")
    public Object selectAuditBlogInfo(@RequestBody WZSHVo wzshVo) {
        PageHelper.startPage(wzshVo.getCurrentPage(), wzshVo.getPageSize());
        List<WZSHVo> wzshVos = blogInfoService.selectAuditBlogInfo();
        System.out.println(wzshVos);
        PageInfo<WZSHVo> wzshPageInfo = new PageInfo<WZSHVo>(wzshVos);
        return wzshPageInfo;
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
    /**
     * 根据blog_id审核文章
     * @param blog_id
     * @return
     */
    @ResponseBody
    @RequestMapping("AuditBlogInfoById")
    public Object AuditBlogInfoById(@RequestParam int blog_id){
        int i = blogInfoService.AuditBlogInfoById(blog_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据blog_id不展示文章
     * @param blog_id
     * @return
     */
    @ResponseBody
    @RequestMapping("soldOutBlogInfoById")
    public Object soldOutBlogInfoById(@RequestParam int blog_id){
        int i = blogInfoService.soldOutBlogInfoById(blog_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }


}
