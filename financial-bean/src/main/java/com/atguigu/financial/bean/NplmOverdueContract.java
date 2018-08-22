package com.atguigu.financial.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_overdue_contract", schema = "financial", catalog = "")
public class NplmOverdueContract implements Serializable{
    private String id;
    private String loanContractNum;
    private String overdueStatus;
    private Integer overdueDays;
    private Integer instalmentCnt;
    private Integer allDays;
    private Integer allInstalmentCnt;
    private Integer allNumber;
    private Integer principalInterest;
    private Integer allForfeit;
    private Integer allAmerce;
    private Integer allShould;
    private Integer allIndeed;
    private Integer currentRepay;
    private Integer allRepaymentAmount;
    private String firstDate;
    private String startDate;
    private String serialStartDate;
    private String overdueHistory;
    private String computeDate;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOAN_CONTRACT_NUM")
    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    @Basic
    @Column(name = "OVERDUE_STATUS")
    public String getOverdueStatus() {
        return overdueStatus;
    }

    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus;
    }

    @Basic
    @Column(name = "OVERDUE_DAYS")
    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    @Basic
    @Column(name = "INSTALMENT_CNT")
    public Integer getInstalmentCnt() {
        return instalmentCnt;
    }

    public void setInstalmentCnt(Integer instalmentCnt) {
        this.instalmentCnt = instalmentCnt;
    }

    @Basic
    @Column(name = "ALL_DAYS")
    public Integer getAllDays() {
        return allDays;
    }

    public void setAllDays(Integer allDays) {
        this.allDays = allDays;
    }

    @Basic
    @Column(name = "ALL_INSTALMENT_CNT")
    public Integer getAllInstalmentCnt() {
        return allInstalmentCnt;
    }

    public void setAllInstalmentCnt(Integer allInstalmentCnt) {
        this.allInstalmentCnt = allInstalmentCnt;
    }

    @Basic
    @Column(name = "ALL_NUMBER")
    public Integer getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }

    @Basic
    @Column(name = "PRINCIPAL_INTEREST")
    public Integer getPrincipalInterest() {
        return principalInterest;
    }

    public void setPrincipalInterest(Integer principalInterest) {
        this.principalInterest = principalInterest;
    }

    @Basic
    @Column(name = "ALL_FORFEIT")
    public Integer getAllForfeit() {
        return allForfeit;
    }

    public void setAllForfeit(Integer allForfeit) {
        this.allForfeit = allForfeit;
    }

    @Basic
    @Column(name = "ALL_AMERCE")
    public Integer getAllAmerce() {
        return allAmerce;
    }

    public void setAllAmerce(Integer allAmerce) {
        this.allAmerce = allAmerce;
    }

    @Basic
    @Column(name = "ALL_SHOULD")
    public Integer getAllShould() {
        return allShould;
    }

    public void setAllShould(Integer allShould) {
        this.allShould = allShould;
    }

    @Basic
    @Column(name = "ALL_INDEED")
    public Integer getAllIndeed() {
        return allIndeed;
    }

    public void setAllIndeed(Integer allIndeed) {
        this.allIndeed = allIndeed;
    }

    @Basic
    @Column(name = "CURRENT_REPAY")
    public Integer getCurrentRepay() {
        return currentRepay;
    }

    public void setCurrentRepay(Integer currentRepay) {
        this.currentRepay = currentRepay;
    }

    @Basic
    @Column(name = "ALL_REPAYMENT_AMOUNT")
    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    @Basic
    @Column(name = "FIRST_DATE")
    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    @Basic
    @Column(name = "START_DATE")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "SERIAL_START_DATE")
    public String getSerialStartDate() {
        return serialStartDate;
    }

    public void setSerialStartDate(String serialStartDate) {
        this.serialStartDate = serialStartDate;
    }

    @Basic
    @Column(name = "OVERDUE_HISTORY")
    public String getOverdueHistory() {
        return overdueHistory;
    }

    public void setOverdueHistory(String overdueHistory) {
        this.overdueHistory = overdueHistory;
    }

    @Basic
    @Column(name = "COMPUTE_DATE")
    public String getComputeDate() {
        return computeDate;
    }

    public void setComputeDate(String computeDate) {
        this.computeDate = computeDate;
    }

    @Basic
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATER")
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "UPDATE_TYPE")
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }


}
