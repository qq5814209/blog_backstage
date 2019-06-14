package com.me.pojo;

/**
 * @author Lee
 * @date 2019-06-13 22:12
 */
public class Order {
    //订单id
    private int order_id;
    //用户id
    private int user_id;
    //c币套餐id
    private int cbi_id;
    //vip套餐id
    private int vip_id;
    //价格
    private Double price;
    //c币套餐数量
    private int cbi_number;
    //vip套餐数量
    private String vip_time;
    //订单创建时间
    private String order_time;
    //状态码
    private int status;
    //订单号
    private String order_number;

    private int currentPage;//当前页
    private int pageSize;//当前页数据条数

    public Order() {
    }

    public Order(int order_id, int user_id, int cbi_id, int vip_id, Double price, int cbi_number, String vip_time, String order_time, int status, String order_number, int currentPage, int pageSize) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.cbi_id = cbi_id;
        this.vip_id = vip_id;
        this.price = price;
        this.cbi_number = cbi_number;
        this.vip_time = vip_time;
        this.order_time = order_time;
        this.status = status;
        this.order_number = order_number;
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

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCbi_id() {
        return cbi_id;
    }

    public void setCbi_id(int cbi_id) {
        this.cbi_id = cbi_id;
    }

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCbi_number() {
        return cbi_number;
    }

    public void setCbi_number(int cbi_number) {
        this.cbi_number = cbi_number;
    }

    public String getVip_time() {
        return vip_time;
    }

    public void setVip_time(String vip_time) {
        this.vip_time = vip_time;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", cbi_id=" + cbi_id +
                ", vip_id=" + vip_id +
                ", price=" + price +
                ", cbi_number=" + cbi_number +
                ", vip_time='" + vip_time + '\'' +
                ", order_time='" + order_time + '\'' +
                ", status=" + status +
                ", order_number='" + order_number + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
