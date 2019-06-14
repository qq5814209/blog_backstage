package com.me.vo;

/**
 * @author Lee
 * @date 2019-06-14 17:56
 */
public class WZJJVo {
    //举报ID
    private int report_id;
    //举报人
    private String name;
    //博客ID
    private int blog_id;
    //举报内容
    private String report_content;
    //状态
    private int status;
    private int currentPage;//当前页
    private int pageSize;//当前页数据条数

    public WZJJVo() {
    }

    public WZJJVo(int report_id, String name, int blog_id, String report_content, int status, int currentPage, int pageSize) {
        this.report_id = report_id;
        this.name = name;
        this.blog_id = blog_id;
        this.report_content = report_content;
        this.status = status;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getReport_content() {
        return report_content;
    }

    public void setReport_content(String report_content) {
        this.report_content = report_content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "WZJJVo{" +
                "report_id=" + report_id +
                ", name='" + name + '\'' +
                ", blog_id=" + blog_id +
                ", report_content='" + report_content + '\'' +
                ", status=" + status +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
