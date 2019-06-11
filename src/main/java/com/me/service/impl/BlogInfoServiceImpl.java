package com.me.service.impl;
import com.me.mapper.BlogInfoMapper;
import com.me.service.BlogInfoService;
import com.me.vo.WZCZVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public WZCZVo selectBlogInfo() {
        WZCZVo wzczVo = blogInfoMapper.selectBlogInfo();
        return wzczVo;
    }
}
