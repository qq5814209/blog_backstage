package com.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.me.pojo.Comment;
import com.me.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 14:39
 */
@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    /**
     * 查询所有评论
     * @return
     */
    @ResponseBody
    @RequestMapping("selectComment")
    public Object selectComment(@RequestBody Comment comment) {
        PageHelper.startPage(comment.getCurrentPage(), comment.getPageSize());
        List<Comment> comments = commentService.selectComment();
        PageInfo<Comment> commentPageInfo = new PageInfo<Comment>(comments);
        return commentPageInfo;
    }

    /**
     * 修改页根据comment_id回显
     * @param comment_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getCommentById")
    public Object getCommentById(@RequestParam int comment_id){
        return commentService.getCommentById(comment_id);
    }

    /**
     * 修改页根据comment_id修改评论
     * @return
     */
    @ResponseBody
    @RequestMapping("updateCommentById")
    public Object updateComment(@RequestBody Comment comment){
        int i = commentService.updateCommentById(comment);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据comment_id删除评论
     * @param comment_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteCommentById")
    public Object deleteCommentById(@RequestParam int comment_id){
        int i = commentService.deleteCommentById(comment_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }
}
