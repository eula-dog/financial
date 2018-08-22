package com.atguigu.financial.bean;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_repayment_detail", schema = "financial", catalog = "")
public class NplmRepaymentDetail {
    private int id;
    private Integer repaymentPlanId;
    private Integer repaymentRecordId;
    private Integer businessRequestId;
    private Integer loanContractNum;
    private Date repaymentDate;
    private Integer instalment;
    private Integer shouldCapital;
    private Integer shouldInterest;
    private Integer shouldInstFee;
    private Integer shouldAmerce;
    private Integer shouldForfeit;
    private Integer shouldPenalty;
    private Integer shouldChangeFee;
    private Integer shouldOtherFee;
    private Integer shouldAmount;
    private Integer indeedCapital;
    private Integer indeedInterest;
    private Integer indeedInstFee;
    private Integer indeedAmerce;
    private Integer indeedForfeit;
    private Integer indeedPenalty;
    private Integer indeedChangeFee;
    private Integer indeedOtherFee;
    private Integer indeedAmount;
    private String status;
    private Integer reduceCapital;
    private Integer reduceInterest;
    private Integer reduceAmerce;
    private Integer reduceForfeit;
    private Integer reducePenalty;
    private Integer reduceInstFee;
    private Integer reducePreFee;
    private Integer reduceOtherFee;
    private String dataCreateType;
    private String remark;
    private String specialCode;
    private Integer sort;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "REPAYMENT_PLAN_ID")
    public Integer getRepaymentPlanId() {
        return repaymentPlanId;
    }

    public void setRepaymentPlanId(Integer repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

    @Basic
    @Column(name = "REPAYMENT_RECORD_ID")
    public Integer getRepaymentRecordId() {
        return repaymentRecordId;
    }

    public void setRepaymentRecordId(Integer repaymentRecordId) {
        this.repaymentRecordId = repaymentRecordId;
    }

    @Basic
    @Column(name = "BUSINESS_REQUEST_ID")
    public Integer getBusinessRequestId() {
        return businessRequestId;
    }

    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
    }

    @Basic
    @Column(name = "LOAN_CONTRACT_NUM")
    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    @Basic
    @Column(name = "REPAYMENT_DATE")
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    @Basic
    @Column(name = "INSTALMENT")
    public Integer getInstalment() {
        return instalment;
    }

    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    @Basic
    @Column(name = "SHOULD_CAPITAL")
    public Integer getShouldCapital() {
        return shouldCapital;
    }

    public void setShouldCapital(Integer shouldCapital) {
        this.shouldCapital = shouldCapital;
    }

    @Basic
    @Column(name = "SHOULD_INTEREST")
    public Integer getShouldInterest() {
        return shouldInterest;
    }

    public void setShouldInterest(Integer shouldInterest) {
        this.shouldInterest = shouldInterest;
    }

    @Basic
    @Column(name = "SHOULD_INST_FEE")
    public Integer getShouldInstFee() {
        return shouldInstFee;
    }

    public void setShouldInstFee(Integer shouldInstFee) {
        this.shouldInstFee = shouldInstFee;
    }

    @Basic
    @Column(name = "SHOULD_AMERCE")
    public Integer getShouldAmerce() {
        return shouldAmerce;
    }

    public void setShouldAmerce(Integer shouldAmerce) {
        this.shouldAmerce = shouldAmerce;
    }

    @Basic
    @Column(name = "SHOULD_FORFEIT")
    public Integer getShouldForfeit() {
        return shouldForfeit;
    }

    public void setShouldForfeit(Integer shouldForfeit) {
        this.shouldForfeit = shouldForfeit;
    }

    @Basic
    @Column(name = "should_penalty")
    public Integer getShouldPenalty() {
        return shouldPenalty;
    }

    public void setShouldPenalty(Integer shouldPenalty) {
        this.shouldPenalty = shouldPenalty;
    }

    @Basic
    @Column(name = "should_change_fee")
    public Integer getShouldChangeFee() {
        return shouldChangeFee;
    }

    public void setShouldChangeFee(Integer shouldChangeFee) {
        this.shouldChangeFee = shouldChangeFee;
    }

    @Basic
    @Column(name = "SHOULD_OTHER_FEE")
    public Integer getShouldOtherFee() {
        return shouldOtherFee;
    }

    public void setShouldOtherFee(Integer shouldOtherFee) {
        this.shouldOtherFee = shouldOtherFee;
    }

    @Basic
    @Column(name = "SHOULD_AMOUNT")
    public Integer getShouldAmount() {
        return shouldAmount;
    }

    public void setShouldAmount(Integer shouldAmount) {
        this.shouldAmount = shouldAmount;
    }

    @Basic
    @Column(name = "INDEED_CAPITAL")
    public Integer getIndeedCapital() {
        return indeedCapital;
    }

    public void setIndeedCapital(Integer indeedCapital) {
        this.indeedCapital = indeedCapital;
    }

    @Basic
    @Column(name = "INDEED_INTEREST")
    public Integer getIndeedInterest() {
        return indeedInterest;
    }

    public void setIndeedInterest(Integer indeedInterest) {
        this.indeedInterest = indeedInterest;
    }

    @Basic
    @Column(name = "INDEED_INST_FEE")
    public Integer getIndeedInstFee() {
        return indeedInstFee;
    }

    public void setIndeedInstFee(Integer indeedInstFee) {
        this.indeedInstFee = indeedInstFee;
    }

    @Basic
    @Column(name = "INDEED_AMERCE")
    public Integer getIndeedAmerce() {
        return indeedAmerce;
    }

    public void setIndeedAmerce(Integer indeedAmerce) {
        this.indeedAmerce = indeedAmerce;
    }

    @Basic
    @Column(name = "INDEED_FORFEIT")
    public Integer getIndeedForfeit() {
        return indeedForfeit;
    }

    public void setIndeedForfeit(Integer indeedForfeit) {
        this.indeedForfeit = indeedForfeit;
    }

    @Basic
    @Column(name = "indeed_penalty")
    public Integer getIndeedPenalty() {
        return indeedPenalty;
    }

    public void setIndeedPenalty(Integer indeedPenalty) {
        this.indeedPenalty = indeedPenalty;
    }

    @Basic
    @Column(name = "indeed_change_fee")
    public Integer getIndeedChangeFee() {
        return indeedChangeFee;
    }

    public void setIndeedChangeFee(Integer indeedChangeFee) {
        this.indeedChangeFee = indeedChangeFee;
    }

    @Basic
    @Column(name = "indeed_OTHER_FEE")
    public Integer getIndeedOtherFee() {
        return indeedOtherFee;
    }

    public void setIndeedOtherFee(Integer indeedOtherFee) {
        this.indeedOtherFee = indeedOtherFee;
    }

    @Basic
    @Column(name = "INDEED_AMOUNT")
    public Integer getIndeedAmount() {
        return indeedAmount;
    }

    public void setIndeedAmount(Integer indeedAmount) {
        this.indeedAmount = indeedAmount;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "reduce_CAPITAL")
    public Integer getReduceCapital() {
        return reduceCapital;
    }

    public void setReduceCapital(Integer reduceCapital) {
        this.reduceCapital = reduceCapital;
    }

    @Basic
    @Column(name = "reduce_INTEREST")
    public Integer getReduceInterest() {
        return reduceInterest;
    }

    public void setReduceInterest(Integer reduceInterest) {
        this.reduceInterest = reduceInterest;
    }

    @Basic
    @Column(name = "reduce_AMERCE")
    public Integer getReduceAmerce() {
        return reduceAmerce;
    }

    public void setReduceAmerce(Integer reduceAmerce) {
        this.reduceAmerce = reduceAmerce;
    }

    @Basic
    @Column(name = "reduce_FORFEIT")
    public Integer getReduceForfeit() {
        return reduceForfeit;
    }

    public void setReduceForfeit(Integer reduceForfeit) {
        this.reduceForfeit = reduceForfeit;
    }

    @Basic
    @Column(name = "reduce_penalty")
    public Integer getReducePenalty() {
        return reducePenalty;
    }

    public void setReducePenalty(Integer reducePenalty) {
        this.reducePenalty = reducePenalty;
    }

    @Basic
    @Column(name = "reduce_INST_FEE")
    public Integer getReduceInstFee() {
        return reduceInstFee;
    }

    public void setReduceInstFee(Integer reduceInstFee) {
        this.reduceInstFee = reduceInstFee;
    }

    @Basic
    @Column(name = "reduce_PRE_FEE")
    public Integer getReducePreFee() {
        return reducePreFee;
    }

    public void setReducePreFee(Integer reducePreFee) {
        this.reducePreFee = reducePreFee;
    }

    @Basic
    @Column(name = "reduce_OTHER_FEE")
    public Integer getReduceOtherFee() {
        return reduceOtherFee;
    }

    public void setReduceOtherFee(Integer reduceOtherFee) {
        this.reduceOtherFee = reduceOtherFee;
    }

    @Basic
    @Column(name = "data_create_type")
    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "SPECIAL_CODE")
    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    @Basic
    @Column(name = "SORT")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
