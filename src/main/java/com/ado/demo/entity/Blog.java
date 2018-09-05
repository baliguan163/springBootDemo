package com.ado.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private Integer blogId;

    private String blogTitle;

    private Integer blogVisit;

    private Integer userId;

    private Date blogDate;

    private Integer blogPv;

    private String blogText;

    private static final long serialVersionUID = 1L;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Integer getBlogVisit() {
        return blogVisit;
    }

    public void setBlogVisit(Integer blogVisit) {
        this.blogVisit = blogVisit;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }

    public Integer getBlogPv() {
        return blogPv;
    }

    public void setBlogPv(Integer blogPv) {
        this.blogPv = blogPv;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText == null ? null : blogText.trim();
    }
}