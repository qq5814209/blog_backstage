package com.me.mapper;

import com.me.pojo.BlogInfo;
import com.me.vo.WZCZVo;

import java.util.List;

public interface BlogInfoMapper {
    /**
     * 查询博客信息
     * @return
     */
    List<WZCZVo> selectBlogInfo();

    /**
     * 修改页根据blog_id回显
     * @param blog_id
     * @return
     */
    WZCZVo getBlogInfoById(int blog_id);

    /**
     * 修改页根据blog_id修改文章
     * @param blogInfo
     * @return
     */
    int updateBlogInfoById(BlogInfo blogInfo);

    /**
     * 根据blog_id删除文章
     * @param blog_id
     * @return
     */
    int deleteBlogInfoById(int blog_id);
}
