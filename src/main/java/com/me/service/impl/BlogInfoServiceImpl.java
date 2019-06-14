package com.me.service.impl;
import com.me.mapper.BlogInfoMapper;
import com.me.pojo.BlogInfo;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
import com.me.vo.WZJJVo;
import com.me.vo.WZSHVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-11 10:43
 */
@Service
public class BlogInfoServiceImpl implements BlogInfoService {

    @Autowired
    BlogInfoMapper blogInfoMapper;

    /**
     * 查询所有博客
     * @return
     */
    public List<WZCZVo> selectBlogInfo() {
        List<WZCZVo> wzczVos = blogInfoMapper.selectBlogInfo();
        return wzczVos;
    }

    /**
     * 查询所有博客信息审核状态
     * @return
     */
    public List<WZSHVo> selectAuditBlogInfo() {
        List<WZSHVo> wzshVos = blogInfoMapper.selectAuditBlogInfo();
        return wzshVos;
    }

    /**
     * 修改页根据blog_id回显
     * @param blog_id
     * @return
     */
    public Object getBlogInfoById(int blog_id) {
        return blogInfoMapper.getBlogInfoById(blog_id);
    }

    /**
     * 修改页根据blog_id修改文章
     * @param blogInfo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateBlogInfoById(BlogInfo blogInfo) {
        int i =blogInfoMapper.updateBlogInfoById(blogInfo);
        return i;
    }

    /**
     * 根据blog_id删除文章
     * @param blog_id
     * @return
     */
    public int deleteBlogInfoById(int blog_id) {
        int i=blogInfoMapper.deleteBlogInfoById(blog_id);
        return i;
    }

    /**
     * 根据blog_id审核文章
     * @param blog_id
     * @return
     */
    public int AuditBlogInfoById(int blog_id) {
        return blogInfoMapper.AuditBlogInfoById(blog_id);
    }

    /**
     * 根据blog_id不展示文章
     * @param blog_id
     * @return
     */
    public int soldOutBlogInfoById(int blog_id) {
        return blogInfoMapper.soldOutBlogInfoById(blog_id);
    }

    /**
     * 查询文章举报
     * @return
     */
    public List<WZJJVo> selectReportBlogInfo() {
        return blogInfoMapper.selectReportBlogInfo();
    }

    /**
     * 根据blog_id处理被举报文章
     * @param blog_id
     * @return
     */
    public int ReportBlogInfoById(int blog_id) {
        return blogInfoMapper.ReportBlogInfoById(blog_id);
    }
}
