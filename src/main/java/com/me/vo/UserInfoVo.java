package com.me.vo;

/**
 * 用于展示userlist.html页面
 */
public class UserInfoVo {
    //用户编号
    private int user_id;
    //用户名
    private String user_name;
    //用户实名
    private String name;
    //用户等级
    private int value;
    //用户身份
    private String vip_name;
    //到期时间
    private String end_time;

    public UserInfoVo() {
    }

    public UserInfoVo(int user_id, String user_name, String name, int value, String vip_name, String end_time) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.name = name;
        this.value = value;
        this.vip_name = vip_name;
        this.end_time = end_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", vip_name='" + vip_name + '\'' +
                ", end_time='" + end_time + '\'' +
                '}';
    }
}
