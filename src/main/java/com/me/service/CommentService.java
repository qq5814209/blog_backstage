package com.me.service;

import com.me.pojo.Comment;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 14:40
 */
public interface CommentService {
    /**
     * 查询所有评论
     * @return
     */
    List<Comment> selectComment();

    /**
     * 修改页根据comment_id回显
     * @param comment_id
     * @return
     */
    Object getCommentById(int comment_id);

    /**
     * 修改页根据comment_id修改评论
     * @param comment
     * @return
     */
    int updateCommentById(Comment comment);

    /**
     * 根据comment_id删除评论
     * @param comment_id
     * @return
     */
    int deleteCommentById(int comment_id);
}
