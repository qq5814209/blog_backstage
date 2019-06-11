package com.me.pojo;

/**
 * favorites表的实体类
 */
public class Favorites {
//    收藏夹id
    private int favorites_id;
//    用户id
    private int user_id;
//    收藏夹描述
    private String favorites_desc;
//    收藏夹标题
    private String favorites_title;
//    状态码
    private int status;

    public int getFavorites_id() {
        return favorites_id;
    }

    public void setFavorites_id(int favorites_id) {
        this.favorites_id = favorites_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFavorites_desc() {
        return favorites_desc;
    }

    public void setFavorites_desc(String favorites_desc) {
        this.favorites_desc = favorites_desc;
    }

    public String getFavorites_title() {
        return favorites_title;
    }

    public void setFavorites_title(String favorites_title) {
        this.favorites_title = favorites_title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "favorites_id=" + favorites_id +
                ", user_id=" + user_id +
                ", favorites_desc='" + favorites_desc + '\'' +
                ", favorites_title='" + favorites_title + '\'' +
                ", status=" + status +
                '}';
    }
}
