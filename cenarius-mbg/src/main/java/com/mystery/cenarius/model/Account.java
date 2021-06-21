package com.mystery.cenarius.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Integer createdBy;

    @ApiModelProperty(value = "")
    private Date createdTime;

    @ApiModelProperty(value = "")
    private Integer updatedBy;

    @ApiModelProperty(value = "")
    private Date updatedTime;

    @ApiModelProperty(value = "")
    private String acctNo;

    @ApiModelProperty(value = "")
    private Integer cardType;

    @ApiModelProperty(value = "")
    private Date clsTime;

    @ApiModelProperty(value = "")
    private Date endTime;

    @ApiModelProperty(value = "")
    private Date openTime;

    @ApiModelProperty(value = "")
    private String payPwd;

    @ApiModelProperty(value = "")
    private String pinFlg;

    @ApiModelProperty(value = "")
    private String qryPwd;

    @ApiModelProperty(value = "")
    private Integer status;

    @ApiModelProperty(value = "")
    private String userCreNo;

    @ApiModelProperty(value = "")
    private String userId;

    @ApiModelProperty(value = "")
    private String userName;

    @ApiModelProperty(value = "")
    private Integer userType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Date getClsTime() {
        return clsTime;
    }

    public void setClsTime(Date clsTime) {
        this.clsTime = clsTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public String getPinFlg() {
        return pinFlg;
    }

    public void setPinFlg(String pinFlg) {
        this.pinFlg = pinFlg;
    }

    public String getQryPwd() {
        return qryPwd;
    }

    public void setQryPwd(String qryPwd) {
        this.qryPwd = qryPwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserCreNo() {
        return userCreNo;
    }

    public void setUserCreNo(String userCreNo) {
        this.userCreNo = userCreNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", acctNo=").append(acctNo);
        sb.append(", cardType=").append(cardType);
        sb.append(", clsTime=").append(clsTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", openTime=").append(openTime);
        sb.append(", payPwd=").append(payPwd);
        sb.append(", pinFlg=").append(pinFlg);
        sb.append(", qryPwd=").append(qryPwd);
        sb.append(", status=").append(status);
        sb.append(", userCreNo=").append(userCreNo);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userType=").append(userType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}