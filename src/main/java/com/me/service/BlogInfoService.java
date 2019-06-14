package com.me.service;

import com.me.pojo.BlogInfo;
import com.me.vo.WZCZVo;
import com.me.vo.WZSHVo;

import java.util.List;

public interface BlogInfoService {
    /**
     * 查询博客信息
     * @return
     */
    List<WZCZVo> selectBlogInfo();

    /**
     *查询所有博客信息审核状态
     * @return
     */
    List<WZSHVo> selectAuditBlogInfo();

    /**
     * 修改页根据blog_id回显
     * @param blog_id
     * @return
     */
    Object getBlogInfoById(int blog_id);

    /**
     * 修改页根据blog_id修改文章
     * @param blogInfo
     * @return
     */
    int updateBlogInfoById(BlogInfo blogInfo);

    /**
     *根据blog_id删除文章
     * @param blog_id
     * @return
     */
    int deleteBlogInfoById(int blog_id);


    /**
     * 根据blog_id审核文章
     * @param blog_id
     * @return
     */
    int AuditBlogInfoById(int blog_id);

    /**
     * 根据blog_id不展示文章
     * @param blog_id
     * @return
     */
    int soldOutBlogInfoById(int blog_id);
}
