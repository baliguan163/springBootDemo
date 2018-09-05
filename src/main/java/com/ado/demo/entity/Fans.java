package com.ado.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Fans implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer noticerId;

    private Date date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNoticerId() {
        return noticerId;
    }

    public void setNoticerId(Integer noticerId) {
        this.noticerId = noticerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}