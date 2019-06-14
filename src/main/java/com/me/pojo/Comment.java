package com.me.pojo;

/**
 * @author Lee
 * @date 2019-06-13 14:34
 */

/**
 * Comment1表的实体类
 */
public class Comment {
    //评论编号
    private int comment_id;
    //用户id
    private int user_id;
    //博客id
    private int blog_id;
    //评论内容
    private String comment_content;

    private int parent_id;
    //评论时间
    private String comment_time;
    //状态
    private int status;

    private int currentPage;//当前页
    private int pageSize;//当前页数据条数

    public Comment() {
    }

    public Comment(int comment_id, int user_id, int blog_id, String comment_content, int parent_id, String comment_time, int status, int currentPage, int pageSize) {
        this.comment_id = comment_id;
        this.user_id = user_id;
        this.blog_id = blog_id;
        this.comment_content = comment_content;
        this.parent_id = parent_id;
        this.comment_time = comment_time;
        this.status = status;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", user_id=" + user_id +
                ", blog_id=" + blog_id +
                ", comment_content='" + comment_content + '\'' +
                ", parent_id=" + parent_id +
                ", comment_time='" + comment_time + '\'' +
                ", status=" + status +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
