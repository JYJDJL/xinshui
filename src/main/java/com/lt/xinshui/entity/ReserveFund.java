package com.lt.xinshui.entity;

import java.util.Date;

public class ReserveFund {
    /**
     * 
     */
    private Integer id;

    /**
     * 时间
     */
    private Date time;

    /**
     * 经手人
     */
    private String experiencedPerson;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 金额
     */
    private String amount;

    /**
     * 收支类型:1、收入，2、支出
     */
    private Integer inouttype;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 凭证（图片）
     */
    private String voucher;

    /**
     * 有无发票：1、有，0没有
     */
    private Integer hasInvoice;

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
     * 时间
     * 
     */
    public Date getTime() {
        return time;
    }

    /**
     * 时间
     * 
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 经手人
     * 
     */
    public String getExperiencedPerson() {
        return experiencedPerson;
    }

    /**
     * 经手人
     * 
     */
    public void setExperiencedPerson(String experiencedPerson) {
        this.experiencedPerson = experiencedPerson == null ? null : experiencedPerson.trim();
    }

    /**
     * 类型
     * 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型
     * 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 金额
     * 
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 金额
     * 
     */
    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    /**
     * 收支类型:1、收入，2、支出
     * 
     */
    public Integer getInouttype() {
        return inouttype;
    }

    /**
     * 收支类型:1、收入，2、支出
     * 
     */
    public void setInouttype(Integer inouttype) {
        this.inouttype = inouttype;
    }

    /**
     * 备注说明
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注说明
     * 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 凭证（图片）
     * 
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * 凭证（图片）
     * 
     */
    public void setVoucher(String voucher) {
        this.voucher = voucher == null ? null : voucher.trim();
    }

    /**
     * 有无发票：1、有，0没有
     * 
     */
    public Integer getHasInvoice() {
        return hasInvoice;
    }

    /**
     * 有无发票：1、有，0没有
     * 
     */
    public void setHasInvoice(Integer hasInvoice) {
        this.hasInvoice = hasInvoice;
    }
}