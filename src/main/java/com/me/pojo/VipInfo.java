package com.me.pojo;

/**
 * @author Lee
 * @date 2019-06-13 17:48
 */

/**
 * vip表的实体类
 */
public class VipInfo {
    //vip套餐id
    private int vip_id;
    //vip套餐名字
    private String vip_name;
    //vip套餐时长
    private String vip_time;
    //vip套餐价格
    private Double vip_price;
    //状态码
    private int status;
    private int vip_down;

    private int currentPage;//当前页
    private int pageSize;//当前页数据条数


    public VipInfo() {
    }

    public VipInfo(int vip_id, String vip_name, String vip_time, Double vip_price, int status, int vip_down, int currentPage, int pageSize) {
        this.vip_id = vip_id;
        this.vip_name = vip_name;
        this.vip_time = vip_time;
        this.vip_price = vip_price;
        this.status = status;
        this.vip_down = vip_down;
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

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getVip_time() {
        return vip_time;
    }

    public void setVip_time(String vip_time) {
        this.vip_time = vip_time;
    }

    public Double getVip_price() {
        return vip_price;
    }

    public void setVip_price(Double vip_price) {
        this.vip_price = vip_price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVip_down() {
        return vip_down;
    }

    public void setVip_down(int vip_down) {
        this.vip_down = vip_down;
    }

    @Override
    public String toString() {
        return "VipInfo{" +
                "vip_id=" + vip_id +
                ", vip_name='" + vip_name + '\'' +
                ", vip_time='" + vip_time + '\'' +
                ", vip_price=" + vip_price +
                ", status=" + status +
                ", vip_down=" + vip_down +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
