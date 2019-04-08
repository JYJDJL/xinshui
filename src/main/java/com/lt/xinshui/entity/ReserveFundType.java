package com.lt.xinshui.entity;

public class ReserveFundType {
    /**
     * 
     */
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 类型
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     * 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}