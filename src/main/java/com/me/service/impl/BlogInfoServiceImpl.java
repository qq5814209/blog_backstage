package com.me.service.impl;
import com.me.mapper.BlogInfoMapper;
import com.me.pojo.BlogInfo;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
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
}
