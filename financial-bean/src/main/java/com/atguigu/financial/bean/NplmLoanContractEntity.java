package com.atguigu.financial.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "nplm_loan_contract", schema = "financial", catalog = "")
public class NplmLoanContractEntity implements Serializable{
    private String id;
    private String loanContractNum;
    private Integer borrowerId;
    private String ecifId;
    private String proCategoryCode;
    private String proCategoryName;
    private Integer productInfoId;
    private Integer loanInstalments;
    private String loanInstalmentUnit;
    private Integer loanAmount;
    private Integer preFee;
    private Integer putAmount;
    private String creditType;
    private String payMod;
    private String repayWay;
    private String loanType;
    private Integer saleDepartmentId;
    private String repayAccountName;
    private String repayAcctIdenType;
    private String repayAcctIdenNum;
    private String repayAccount;
    private String repayAccountType;
    private String repayAccountBankid;
    private String repayActBranchNo;
    private String repayAccountBankName;
    private String publicPrivate;
    private String repayActProvince;
    private String repayAccountCity;
    private String posStatus;
    private Date startDate;
    private Date endDate;
    private String contractSource;
    private Integer repayBalance;
    private String contractType;
    private String creator;
    private String updater;
    private String createTime;
    private String updateTime;
    private String remark;
    private String cycleCreditId;
    private String updateType;

    @Id
    @Column(name = "ID")
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
    @Column(name = "borrower_id")
    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Basic
    @Column(name = "ECIF_ID")
    public String getEcifId() {
        return ecifId;
    }

    public void setEcifId(String ecifId) {
        this.ecifId = ecifId;
    }

    @Basic
    @Column(name = "pro_CATEGORY_CODE")
    public String getProCategoryCode() {
        return proCategoryCode;
    }

    public void setProCategoryCode(String proCategoryCode) {
        this.proCategoryCode = proCategoryCode;
    }

    @Basic
    @Column(name = "pro_CATEGORY_NAME")
    public String getProCategoryName() {
        return proCategoryName;
    }

    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName;
    }

    @Basic
    @Column(name = "PRODUCT_INFO_ID")
    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    @Basic
    @Column(name = "LOAN_INSTALMENTS")
    public Integer getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    @Basic
    @Column(name = "LOAN_INSTALMENT_UNIT")
    public String getLoanInstalmentUnit() {
        return loanInstalmentUnit;
    }

    public void setLoanInstalmentUnit(String loanInstalmentUnit) {
        this.loanInstalmentUnit = loanInstalmentUnit;
    }

    @Basic
    @Column(name = "LOAN_AMOUNT")
    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Basic
    @Column(name = "PRE_FEE")
    public Integer getPreFee() {
        return preFee;
    }

    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }

    @Basic
    @Column(name = "PUT_AMOUNT")
    public Integer getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

    @Basic
    @Column(name = "CREDIT_TYPE")
    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    @Basic
    @Column(name = "PAY_MOD")
    public String getPayMod() {
        return payMod;
    }

    public void setPayMod(String payMod) {
        this.payMod = payMod;
    }

    @Basic
    @Column(name = "REPAY_WAY")
    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }

    @Basic
    @Column(name = "LOAN_TYPE")
    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Basic
    @Column(name = "SALE_DEPARTMENT_ID")
    public Integer getSaleDepartmentId() {
        return saleDepartmentId;
    }

    public void setSaleDepartmentId(Integer saleDepartmentId) {
        this.saleDepartmentId = saleDepartmentId;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT_NAME")
    public String getRepayAccountName() {
        return repayAccountName;
    }

    public void setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName;
    }

    @Basic
    @Column(name = "REPAY_ACCT_IDEN_TYPE")
    public String getRepayAcctIdenType() {
        return repayAcctIdenType;
    }

    public void setRepayAcctIdenType(String repayAcctIdenType) {
        this.repayAcctIdenType = repayAcctIdenType;
    }

    @Basic
    @Column(name = "REPAY_ACCT_IDEN_NUM")
    public String getRepayAcctIdenNum() {
        return repayAcctIdenNum;
    }

    public void setRepayAcctIdenNum(String repayAcctIdenNum) {
        this.repayAcctIdenNum = repayAcctIdenNum;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT")
    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT_TYPE")
    public String getRepayAccountType() {
        return repayAccountType;
    }

    public void setRepayAccountType(String repayAccountType) {
        this.repayAccountType = repayAccountType;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT_BANKID")
    public String getRepayAccountBankid() {
        return repayAccountBankid;
    }

    public void setRepayAccountBankid(String repayAccountBankid) {
        this.repayAccountBankid = repayAccountBankid;
    }

    @Basic
    @Column(name = "REPAY_ACT_BRANCH_NO")
    public String getRepayActBranchNo() {
        return repayActBranchNo;
    }

    public void setRepayActBranchNo(String repayActBranchNo) {
        this.repayActBranchNo = repayActBranchNo;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT_BANK_NAME")
    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
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
    @Column(name = "REPAY_ACT_PROVINCE")
    public String getRepayActProvince() {
        return repayActProvince;
    }

    public void setRepayActProvince(String repayActProvince) {
        this.repayActProvince = repayActProvince;
    }

    @Basic
    @Column(name = "REPAY_ACCOUNT_CITY")
    public String getRepayAccountCity() {
        return repayAccountCity;
    }

    public void setRepayAccountCity(String repayAccountCity) {
        this.repayAccountCity = repayAccountCity;
    }

    @Basic
    @Column(name = "POS_STATUS")
    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }

    @Basic
    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "CONTRACT_SOURCE")
    public String getContractSource() {
        return contractSource;
    }

    public void setContractSource(String contractSource) {
        this.contractSource = contractSource;
    }

    @Basic
    @Column(name = "REPAY_BALANCE")
    public Integer getRepayBalance() {
        return repayBalance;
    }

    public void setRepayBalance(Integer repayBalance) {
        this.repayBalance = repayBalance;
    }

    @Basic
    @Column(name = "CONTRACT_TYPE")
    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
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
    @Column(name = "UPDATER")
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "CYCLE_CREDIT_ID")
    public String getCycleCreditId() {
        return cycleCreditId;
    }

    public void setCycleCreditId(String cycleCreditId) {
        this.cycleCreditId = cycleCreditId;
    }

    @Basic
    @Column(name = "UPDATE_TYPE")
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NplmLoanContractEntity that = (NplmLoanContractEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (loanContractNum != null ? !loanContractNum.equals(that.loanContractNum) : that.loanContractNum != null)
            return false;
        if (borrowerId != null ? !borrowerId.equals(that.borrowerId) : that.borrowerId != null) return false;
        if (ecifId != null ? !ecifId.equals(that.ecifId) : that.ecifId != null) return false;
        if (proCategoryCode != null ? !proCategoryCode.equals(that.proCategoryCode) : that.proCategoryCode != null)
            return false;
        if (proCategoryName != null ? !proCategoryName.equals(that.proCategoryName) : that.proCategoryName != null)
            return false;
        if (productInfoId != null ? !productInfoId.equals(that.productInfoId) : that.productInfoId != null)
            return false;
        if (loanInstalments != null ? !loanInstalments.equals(that.loanInstalments) : that.loanInstalments != null)
            return false;
        if (loanInstalmentUnit != null ? !loanInstalmentUnit.equals(that.loanInstalmentUnit) : that.loanInstalmentUnit != null)
            return false;
        if (loanAmount != null ? !loanAmount.equals(that.loanAmount) : that.loanAmount != null) return false;
        if (preFee != null ? !preFee.equals(that.preFee) : that.preFee != null) return false;
        if (putAmount != null ? !putAmount.equals(that.putAmount) : that.putAmount != null) return false;
        if (creditType != null ? !creditType.equals(that.creditType) : that.creditType != null) return false;
        if (payMod != null ? !payMod.equals(that.payMod) : that.payMod != null) return false;
        if (repayWay != null ? !repayWay.equals(that.repayWay) : that.repayWay != null) return false;
        if (loanType != null ? !loanType.equals(that.loanType) : that.loanType != null) return false;
        if (saleDepartmentId != null ? !saleDepartmentId.equals(that.saleDepartmentId) : that.saleDepartmentId != null)
            return false;
        if (repayAccountName != null ? !repayAccountName.equals(that.repayAccountName) : that.repayAccountName != null)
            return false;
        if (repayAcctIdenType != null ? !repayAcctIdenType.equals(that.repayAcctIdenType) : that.repayAcctIdenType != null)
            return false;
        if (repayAcctIdenNum != null ? !repayAcctIdenNum.equals(that.repayAcctIdenNum) : that.repayAcctIdenNum != null)
            return false;
        if (repayAccount != null ? !repayAccount.equals(that.repayAccount) : that.repayAccount != null) return false;
        if (repayAccountType != null ? !repayAccountType.equals(that.repayAccountType) : that.repayAccountType != null)
            return false;
        if (repayAccountBankid != null ? !repayAccountBankid.equals(that.repayAccountBankid) : that.repayAccountBankid != null)
            return false;
        if (repayActBranchNo != null ? !repayActBranchNo.equals(that.repayActBranchNo) : that.repayActBranchNo != null)
            return false;
        if (repayAccountBankName != null ? !repayAccountBankName.equals(that.repayAccountBankName) : that.repayAccountBankName != null)
            return false;
        if (publicPrivate != null ? !publicPrivate.equals(that.publicPrivate) : that.publicPrivate != null)
            return false;
        if (repayActProvince != null ? !repayActProvince.equals(that.repayActProvince) : that.repayActProvince != null)
            return false;
        if (repayAccountCity != null ? !repayAccountCity.equals(that.repayAccountCity) : that.repayAccountCity != null)
            return false;
        if (posStatus != null ? !posStatus.equals(that.posStatus) : that.posStatus != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (contractSource != null ? !contractSource.equals(that.contractSource) : that.contractSource != null)
            return false;
        if (repayBalance != null ? !repayBalance.equals(that.repayBalance) : that.repayBalance != null) return false;
        if (contractType != null ? !contractType.equals(that.contractType) : that.contractType != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (cycleCreditId != null ? !cycleCreditId.equals(that.cycleCreditId) : that.cycleCreditId != null)
            return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loanContractNum != null ? loanContractNum.hashCode() : 0);
        result = 31 * result + (borrowerId != null ? borrowerId.hashCode() : 0);
        result = 31 * result + (ecifId != null ? ecifId.hashCode() : 0);
        result = 31 * result + (proCategoryCode != null ? proCategoryCode.hashCode() : 0);
        result = 31 * result + (proCategoryName != null ? proCategoryName.hashCode() : 0);
        result = 31 * result + (productInfoId != null ? productInfoId.hashCode() : 0);
        result = 31 * result + (loanInstalments != null ? loanInstalments.hashCode() : 0);
        result = 31 * result + (loanInstalmentUnit != null ? loanInstalmentUnit.hashCode() : 0);
        result = 31 * result + (loanAmount != null ? loanAmount.hashCode() : 0);
        result = 31 * result + (preFee != null ? preFee.hashCode() : 0);
        result = 31 * result + (putAmount != null ? putAmount.hashCode() : 0);
        result = 31 * result + (creditType != null ? creditType.hashCode() : 0);
        result = 31 * result + (payMod != null ? payMod.hashCode() : 0);
        result = 31 * result + (repayWay != null ? repayWay.hashCode() : 0);
        result = 31 * result + (loanType != null ? loanType.hashCode() : 0);
        result = 31 * result + (saleDepartmentId != null ? saleDepartmentId.hashCode() : 0);
        result = 31 * result + (repayAccountName != null ? repayAccountName.hashCode() : 0);
        result = 31 * result + (repayAcctIdenType != null ? repayAcctIdenType.hashCode() : 0);
        result = 31 * result + (repayAcctIdenNum != null ? repayAcctIdenNum.hashCode() : 0);
        result = 31 * result + (repayAccount != null ? repayAccount.hashCode() : 0);
        result = 31 * result + (repayAccountType != null ? repayAccountType.hashCode() : 0);
        result = 31 * result + (repayAccountBankid != null ? repayAccountBankid.hashCode() : 0);
        result = 31 * result + (repayActBranchNo != null ? repayActBranchNo.hashCode() : 0);
        result = 31 * result + (repayAccountBankName != null ? repayAccountBankName.hashCode() : 0);
        result = 31 * result + (publicPrivate != null ? publicPrivate.hashCode() : 0);
        result = 31 * result + (repayActProvince != null ? repayActProvince.hashCode() : 0);
        result = 31 * result + (repayAccountCity != null ? repayAccountCity.hashCode() : 0);
        result = 31 * result + (posStatus != null ? posStatus.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (contractSource != null ? contractSource.hashCode() : 0);
        result = 31 * result + (repayBalance != null ? repayBalance.hashCode() : 0);
        result = 31 * result + (contractType != null ? contractType.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (cycleCreditId != null ? cycleCreditId.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        return result;
    }
}
