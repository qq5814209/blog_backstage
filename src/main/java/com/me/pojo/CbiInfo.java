package com.me.pojo;

/**
 * @author Lee
 * @date 2019-06-13 19:57
 */
public class CbiInfo {
    //c币id
    private int cbi_id;
    //c币套餐名字
    private String cbi_name;
    //套餐c币数量
    private String cbi_number;
    //c币套餐价格
    private Double cbi_price;
    //状态码
    private int status;

    private int currentPage;//当前页
    private int pageSize;//当前页数据条数

    public CbiInfo() {
    }

    public CbiInfo(int cbi_id, String cbi_name, String cbi_number, Double cbi_price, int status, int currentPage, int pageSize) {
        this.cbi_id = cbi_id;
        this.cbi_name = cbi_name;
        this.cbi_number = cbi_number;
        this.cbi_price = cbi_price;
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

    public int getCbi_id() {
        return cbi_id;
    }

    public void setCbi_id(int cbi_id) {
        this.cbi_id = cbi_id;
    }

    public String getCbi_name() {
        return cbi_name;
    }

    public void setCbi_name(String cbi_name) {
        this.cbi_name = cbi_name;
    }

    public String getCbi_number() {
        return cbi_number;
    }

    public void setCbi_number(String cbi_number) {
        this.cbi_number = cbi_number;
    }

    public Double getCbi_price() {
        return cbi_price;
    }

    public void setCbi_price(Double cbi_price) {
        this.cbi_price = cbi_price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CbiInfo{" +
                "cbi_id=" + cbi_id +
                ", cbi_name='" + cbi_name + '\'' +
                ", cbi_number='" + cbi_number + '\'' +
                ", cbi_price=" + cbi_price +
                ", status=" + status +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
