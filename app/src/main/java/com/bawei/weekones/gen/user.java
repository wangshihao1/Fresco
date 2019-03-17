package com.bawei.weekones.gen;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "user")
public class user {
    @Id
    private long id;
    private String uniquekey;
    private String title;
    private String date;
    private String category;
    private String author_name;
    private String url;
    private String thumbnail_pic_s;
    private String thumbnail_pic_s02;
    private String thumbnail_pic_s03;
    @Generated(hash = 1481738061)
    public user(long id, String uniquekey, String title, String date,
            String category, String author_name, String url, String thumbnail_pic_s,
            String thumbnail_pic_s02, String thumbnail_pic_s03) {
        this.id = id;
        this.uniquekey = uniquekey;
        this.title = title;
        this.date = date;
        this.category = category;
        this.author_name = author_name;
        this.url = url;
        this.thumbnail_pic_s = thumbnail_pic_s;
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }
    @Generated(hash = 591315204)
    public user() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUniquekey() {
        return this.uniquekey;
    }
    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getAuthor_name() {
        return this.author_name;
    }
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getThumbnail_pic_s() {
        return this.thumbnail_pic_s;
    }
    public void setThumbnail_pic_s(String thumbnail_pic_s) {
        this.thumbnail_pic_s = thumbnail_pic_s;
    }
    public String getThumbnail_pic_s02() {
        return this.thumbnail_pic_s02;
    }
    public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
    }
    public String getThumbnail_pic_s03() {
        return this.thumbnail_pic_s03;
    }
    public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }
}
