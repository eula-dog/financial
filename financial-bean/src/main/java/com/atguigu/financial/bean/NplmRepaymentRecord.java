package com.atguigu.financial.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_repayment_record", schema = "financial", catalog = "")
public class NplmRepaymentRecord implements Serializable{
    private int id;
    private Integer businessRequestId;
    private Integer loanContractNum;
    private Date repaymentDate;
    private Integer overdueDays;
    private Integer overdueAmount;
    private Integer repaymentAmount;
    private Integer successAmount;
    private String status;
    private String remark;
    private String specialCode;
    private Integer sort;
    private String dataCreateType;
    private Timestamp reserveTime;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String accountName;
    private String acctIdenType;
    private String acctIdenNum;
    private String accountNo;
    private String accountType;
    private String accountBankid;
    private String accountBranchNo;
    private String accountBankName;
    private String publicPrivate;
    private String actProvince;
    private String accountCity;
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
    @Column(name = "OVERDUE_DAYS")
    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    @Basic
    @Column(name = "OVERDUE_AMOUNT")
    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    @Basic
    @Column(name = "REPAYMENT_AMOUNT")
    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    @Basic
    @Column(name = "SUCCESS_AMOUNT")
    public Integer getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
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
    @Column(name = "data_create_type")
    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
    }

    @Basic
    @Column(name = "RESERVE_TIME")
    public Timestamp getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Timestamp reserveTime) {
        this.reserveTime = reserveTime;
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
    @Column(name = "ACCOUNT_NAME")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "ACCT_IDEN_TYPE")
    public String getAcctIdenType() {
        return acctIdenType;
    }

    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType;
    }

    @Basic
    @Column(name = "ACCT_IDEN_NUM")
    public String getAcctIdenNum() {
        return acctIdenNum;
    }

    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum;
    }

    @Basic
    @Column(name = "ACCOUNT_NO")
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Basic
    @Column(name = "ACCOUNT_TYPE")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "ACCOUNT_BANKID")
    public String getAccountBankid() {
        return accountBankid;
    }

    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid;
    }

    @Basic
    @Column(name = "ACCOUNT_BRANCH_NO")
    public String getAccountBranchNo() {
        return accountBranchNo;
    }

    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo;
    }

    @Basic
    @Column(name = "ACCOUNT_BANK_NAME")
    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    @Basic
    @Column(name = "PUBLIC_PRIVATE")
    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    @Basic
    @Column(name = "ACT_PROVINCE")
    public String getActProvince() {
        return actProvince;
    }

    public void setActProvince(String actProvince) {
        this.actProvince = actProvince;
    }

    @Basic
    @Column(name = "ACCOUNT_CITY")
    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
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
