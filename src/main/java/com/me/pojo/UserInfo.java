package com.me.pojo;

import java.util.Date;

/**
 * userInfo表的实体类
 */
public class UserInfo {
//    用户id
    private int user_id;
//    用户名
    private String user_name;
//    密码
    private String password;
//    邮箱
    private String email;
//    实名/昵称
    private String name;
//    性别
    private String sex;
//    职业
    private String job;
//    个人简介
    private String brief;
//    年
    private String year;
//    月
    private String month;
//    日
    private String day;
//    国家
    private String country;
//    城市
    private String city;
//    乡镇
    private String town;
//    C币数量
    private int cbis;
//    用户创建时间
    private Date create_time;
//    状态
    private int status;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getCbis() {
        return cbis;
    }

    public void setCbis(int cbis) {
        this.cbis = cbis;
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
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                ", brief='" + brief + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", cbis=" + cbis +
                ", create_time=" + create_time +
                ", status=" + status +
                '}';
    }
}
