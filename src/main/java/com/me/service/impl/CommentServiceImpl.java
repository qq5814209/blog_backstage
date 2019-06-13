package com.me.service.impl;

import com.me.mapper.CommentMapper;
import com.me.pojo.Comment;
import com.me.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 14:41
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    /**
     * 查询所有评论
     * @return
     */
    public List<Comment> selectComment() {
        return commentMapper.selectComment();
    }

    /**
     * 修改页根据comment_id回显
     * @param comment_id
     * @return
     */
    public Object getCommentById(int comment_id) {
        return commentMapper.getCommentById(comment_id);
    }

    /**
     * 修改页根据comment_id修改评论
     * @param comment
     * @return
     */
    public int updateCommentById(Comment comment) {
        int i =commentMapper.updateCommentById(comment);
        return i;
    }

    /**
     * 根据comment_id删除评论
     * @param comment_id
     * @return
     */
    public int deleteCommentById(int comment_id) {
        int i=commentMapper.deleteCommentById(comment_id);
        return i;
    }
}
