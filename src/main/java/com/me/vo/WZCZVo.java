package com.me.vo;

/**
 * @author Lee
 * @date 2019-06-10 20:20
 * 用于展示文章操作页面
 */
public class WZCZVo {
    private int blog_id;
    private String blog_title;
    private String type_name;
    private String name;
    private String create_time;
    private int commentCount;
    private int browseCount;
    private int praiseCount;

    public WZCZVo(int blog_id, String blog_title, String type_name, String name, String create_time, int commentCount, int browseCount, int praiseCount) {
        this.blog_id = blog_id;
        this.blog_title = blog_title;
        this.type_name = type_name;
        this.name = name;
        this.create_time = create_time;
        this.commentCount = commentCount;
        this.browseCount = browseCount;
        this.praiseCount = praiseCount;
    }

    public WZCZVo() {
    }

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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(int browseCount) {
        this.browseCount = browseCount;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    @Override
    public String toString() {
        return "WZCZVo{" +
                "blog_id=" + blog_id +
                ", blog_title='" + blog_title + '\'' +
                ", type_name='" + type_name + '\'' +
                ", name='" + name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", commentCount=" + commentCount +
                ", browseCount=" + browseCount +
                ", praiseCount=" + praiseCount +
                '}';
    }
}
