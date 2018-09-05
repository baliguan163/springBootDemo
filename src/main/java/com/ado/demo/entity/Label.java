package com.ado.demo.entity;

import java.io.Serializable;

public class Label implements Serializable {
    private Integer labelId;

    private String labelTitle;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getLabelTitle() {
        return labelTitle;
    }

    public void setLabelTitle(String labelTitle) {
        this.labelTitle = labelTitle == null ? null : labelTitle.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}