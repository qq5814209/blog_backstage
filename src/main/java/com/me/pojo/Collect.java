package com.me.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * collect表的实体类
 */
public class Collect {
//    收藏id
    private int collect_id;
//    用户id
    private int user_id;
//    博客id
    private int blog_id;
//    收藏时间
    private String collect_time;
//    状态码
    private int status;

    public int getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(int collect_id) {
        this.collect_id = collect_id;
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

    public String getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(Date collect_time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = simpleDateFormat.format(collect_time);
        this.collect_time = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collect_id=" + collect_id +
                ", user_id=" + user_id +
                ", blog_id=" + blog_id +
                ", collect_time=" + collect_time +
                ", status=" + status +
                '}';
    }
}
