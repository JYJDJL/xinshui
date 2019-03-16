package com.lt.xinshui.entity;

import java.util.Date;

public class User {
    /**
     * 
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 生日
     */
    private Date dateOfBirth;

    /**
     * 年龄
     */
    private String age;

    /**
     * 民族
     */
    private String nation;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 政治面貌
     */
    private String politicalOutlook;

    /**
     * 学历
     */
    private String education;

    /**
     * 毕业学校
     */
    private String graduateSchool;

    /**
     * 毕业时间
     */
    private Date graduationTime;

    /**
     * 户口所在地详细地址
     */
    private String registeredAddress;

    /**
     * 户口性质
     */
    private String accountCharacter;

    /**
     * 入职时间
     */
    private Date entryTime;

    /**
     * 入职年限
     */
    private String entryYears;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 应急联系人
     */
    private String emergencyContact;

    /**
     * 应急联系人与本人关系
     */
    private String emergencyContactRelations;

    /**
     * 应急联系人电话
     */
    private String emergencyContactTel;

    /**
     * 银行卡号
     */
    private String bankCardNumber;

    /**
     * 社会保险
     */
    private String socialInsurance;

    /**
     * 公积金
     */
    private String accumulationFund;

    /**
     * 转正日期
     */
    private Date dateOfCorrection;

    /**
     * 年假天数
     */
    private String daysOfAnnualLeave;

    /**
     * qq号
     */
    private String qq;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 离职状态：1、在职，0、离职
     */
    private String isActive;

    /**
     * 新增时间
     */
    private Date insTime;

    /**
     * 新增人
     */
    private String insUser;

    /**
     * 修改时间
     */
    private Date updTime;

    /**
     * 修改人
     */
    private String updUser;

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
     * 姓名
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 性别
     * 
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * 
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 身份证号
     * 
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证号
     * 
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 生日
     * 
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * 生日
     * 
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * 年龄
     * 
     */
    public String getAge() {
        return age;
    }

    /**
     * 年龄
     * 
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 民族
     * 
     */
    public String getNation() {
        return nation;
    }

    /**
     * 民族
     * 
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 婚姻状况
     * 
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 婚姻状况
     * 
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    /**
     * 政治面貌
     * 
     */
    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    /**
     * 政治面貌
     * 
     */
    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook == null ? null : politicalOutlook.trim();
    }

    /**
     * 学历
     * 
     */
    public String getEducation() {
        return education;
    }

    /**
     * 学历
     * 
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 毕业学校
     * 
     */
    public String getGraduateSchool() {
        return graduateSchool;
    }

    /**
     * 毕业学校
     * 
     */
    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    /**
     * 毕业时间
     * 
     */
    public Date getGraduationTime() {
        return graduationTime;
    }

    /**
     * 毕业时间
     * 
     */
    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    /**
     * 户口所在地详细地址
     * 
     */
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    /**
     * 户口所在地详细地址
     * 
     */
    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    /**
     * 户口性质
     * 
     */
    public String getAccountCharacter() {
        return accountCharacter;
    }

    /**
     * 户口性质
     * 
     */
    public void setAccountCharacter(String accountCharacter) {
        this.accountCharacter = accountCharacter == null ? null : accountCharacter.trim();
    }

    /**
     * 入职时间
     * 
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * 入职时间
     * 
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * 入职年限
     * 
     */
    public String getEntryYears() {
        return entryYears;
    }

    /**
     * 入职年限
     * 
     */
    public void setEntryYears(String entryYears) {
        this.entryYears = entryYears == null ? null : entryYears.trim();
    }

    /**
     * 手机号
     * 
     */
    public String getTel() {
        return tel;
    }

    /**
     * 手机号
     * 
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 应急联系人
     * 
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * 应急联系人
     * 
     */
    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    /**
     * 应急联系人与本人关系
     * 
     */
    public String getEmergencyContactRelations() {
        return emergencyContactRelations;
    }

    /**
     * 应急联系人与本人关系
     * 
     */
    public void setEmergencyContactRelations(String emergencyContactRelations) {
        this.emergencyContactRelations = emergencyContactRelations == null ? null : emergencyContactRelations.trim();
    }

    /**
     * 应急联系人电话
     * 
     */
    public String getEmergencyContactTel() {
        return emergencyContactTel;
    }

    /**
     * 应急联系人电话
     * 
     */
    public void setEmergencyContactTel(String emergencyContactTel) {
        this.emergencyContactTel = emergencyContactTel == null ? null : emergencyContactTel.trim();
    }

    /**
     * 银行卡号
     * 
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 银行卡号
     * 
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber == null ? null : bankCardNumber.trim();
    }

    /**
     * 社会保险
     * 
     */
    public String getSocialInsurance() {
        return socialInsurance;
    }

    /**
     * 社会保险
     * 
     */
    public void setSocialInsurance(String socialInsurance) {
        this.socialInsurance = socialInsurance == null ? null : socialInsurance.trim();
    }

    /**
     * 公积金
     * 
     */
    public String getAccumulationFund() {
        return accumulationFund;
    }

    /**
     * 公积金
     * 
     */
    public void setAccumulationFund(String accumulationFund) {
        this.accumulationFund = accumulationFund == null ? null : accumulationFund.trim();
    }

    /**
     * 转正日期
     * 
     */
    public Date getDateOfCorrection() {
        return dateOfCorrection;
    }

    /**
     * 转正日期
     * 
     */
    public void setDateOfCorrection(Date dateOfCorrection) {
        this.dateOfCorrection = dateOfCorrection;
    }

    /**
     * 年假天数
     * 
     */
    public String getDaysOfAnnualLeave() {
        return daysOfAnnualLeave;
    }

    /**
     * 年假天数
     * 
     */
    public void setDaysOfAnnualLeave(String daysOfAnnualLeave) {
        this.daysOfAnnualLeave = daysOfAnnualLeave == null ? null : daysOfAnnualLeave.trim();
    }

    /**
     * qq号
     * 
     */
    public String getQq() {
        return qq;
    }

    /**
     * qq号
     * 
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 微信号
     * 
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 微信号
     * 
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * 离职状态：1、在职，0、离职
     * 
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * 离职状态：1、在职，0、离职
     * 
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    /**
     * 新增时间
     * 
     */
    public Date getInsTime() {
        return insTime;
    }

    /**
     * 新增时间
     * 
     */
    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    /**
     * 新增人
     * 
     */
    public String getInsUser() {
        return insUser;
    }

    /**
     * 新增人
     * 
     */
    public void setInsUser(String insUser) {
        this.insUser = insUser == null ? null : insUser.trim();
    }

    /**
     * 修改时间
     * 
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 修改时间
     * 
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * 修改人
     * 
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * 修改人
     * 
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser == null ? null : updUser.trim();
    }
}