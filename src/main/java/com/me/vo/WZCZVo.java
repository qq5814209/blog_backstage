package com.me.vo;

/**
 * @author Lee
 * @date 2019-06-10 20:20
 * 用于展示文章操作页面
 */
public class WZCZVo {
    private int blog_id;
    private String blog_title;
    private String blog_type;
    private String name;
    private String creat_time;
    private int commentCount;
    private int browseCount;
    private int praiseCount;

    public WZCZVo(int blog_id, String blog_title, String blog_type, String name, String creat_time, int commentCount, int browseCount, int praiseCount) {
        this.blog_id = blog_id;
        this.blog_title = blog_title;
        this.blog_type = blog_type;
        this.name = name;
        this.creat_time = creat_time;
        this.commentCount = commentCount;
        this.browseCount = browseCount;
        this.praiseCount = praiseCount;
    }

    public WZCZVo() {
    }

    public int getBlog_id() {
        return blog_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public String getBlog_type() {
        return blog_type;
    }

    public String getName() {
        return name;
    }

    public String getCreat_time() {
        return creat_time;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getBrowseCount() {
        return browseCount;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public void setBlog_type(String blog_type) {
        this.blog_type = blog_type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreat_time(String creat_time) {
        this.creat_time = creat_time;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setBrowseCount(int browseCount) {
        this.browseCount = browseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    @Override
    public String toString() {
        return "WZCZVo{" +
                "blog_id=" + blog_id +
                ", blog_title='" + blog_title + '\'' +
                ", blog_type='" + blog_type + '\'' +
                ", name='" + name + '\'' +
                ", creat_time='" + creat_time + '\'' +
                ", commentCount=" + commentCount +
                ", browseCount=" + browseCount +
                ", praiseCount=" + praiseCount +
                '}';
    }
}
