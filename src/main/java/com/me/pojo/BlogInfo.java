package com.me.pojo;

import java.util.Date;

/**
 * blogInfo表的实体类
 */
public class BlogInfo {
//    博客id
    private int blog_id;
//    博客标题
    private String blog_title;
//    博客内容
    private String blog_content;
//    博客分类id
    private int bt_id;
//    博客创建时间
    private Date create_time;
//    状态码
    private int status;

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }

    public int getBt_id() {
        return bt_id;
    }

    public void setBt_id(int bt_id) {
        this.bt_id = bt_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BlogInfo{" +
                "blog_id=" + blog_id +
                ", blog_title='" + blog_title + '\'' +
                ", blog_content=" + blog_content +
                ", bt_id=" + bt_id +
                ", create_time=" + create_time +
                ", status=" + status +
                '}';
    }
}
