package com.atguigu.financial.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_contract_attribute", schema = "financial", catalog = "")
public class NplmContractAttributeEntity {
    private int id;
    private Integer loanContractId;
    private Integer loanContractNum;
    private String businessType;
    private String isExpedited;
    private String signDate;
    private Integer signType;
    private String approveDate;
    private String firstRepayDate;
    private Integer feeFlag;
    private String interestFlag;
    private Integer interestType;
    private Integer graceDays;
    private Integer irr;
    private Integer lnsRate;
    private String channelCode;
    private String channelName;
    private String loanOfficerId;
    //private String cityID;
    private String city;
    private String isModify;
    private String isSchemeModify;
    private Integer recycleWay;
    private String isRecycleLoad;
    private Integer recycleLoanCnt;
    private String oldContractNum;
    private Integer settleAmount;
    private String newContractNum;
    private String isShorten;
    private String isExtend;
    private String isChangeProduce;
    private String isOverdue;
    private String isPayAhead;
    private String isPayPart;
    private String purpose;
    private String purposeSon;
    private String purposeDetail;
    private String isDivAccount;
    private String systemType;
    private String highRisk;
    private String isBuyout;
    private String feeProcessType;
    private String studentCorpName;
    private String settleDate;
    private String habitTime;
   // private String repayDay;
    private String applyId;
    private String oldApplyId;
    private String deptId;
    private String deptName;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;
    private Integer frontChargeDiscount;
    private Integer monthMRate;
    private Integer handleChargeRate;
    private Integer loanTimes;
    private String pawn;
    private Integer handleCharge;
    private Integer monthChargeDiscount;
    private Integer guaranteeFee;
    private String guaranteeCompany;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;
    private String def6;
    private String def7;
    private String def8;
    private String def9;
    private String def10;

    @Transient
    private  NplmBorrowerInfoEntity nbi;
    @Transient
    private NplmLoanContractEntity nlce;

    public NplmBorrowerInfoEntity getNbi() {
        return nbi;
    }

    public void setNbi(NplmBorrowerInfoEntity nbi) {
        this.nbi = nbi;
    }

    public NplmLoanContractEntity getNlce() {
        return nlce;
    }

    public void setNlce(NplmLoanContractEntity nlce) {
        this.nlce = nlce;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loan_contract_id")
    public Integer getLoanContractId() {
        return loanContractId;
    }

    public void setLoanContractId(Integer loanContractId) {
        this.loanContractId = loanContractId;
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
    @Column(name = "business_type")
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "is_expedited")
    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    @Basic
    @Column(name = "sign_date")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    @Basic
    @Column(name = "sign_type")
    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    @Basic
    @Column(name = "approve_date")
    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @Basic
    @Column(name = "first_repay_date")
    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate;
    }

    @Basic
    @Column(name = "fee_flag")
    public Integer getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(Integer feeFlag) {
        this.feeFlag = feeFlag;
    }

    @Basic
    @Column(name = "interest_flag")
    public String getInterestFlag() {
        return interestFlag;
    }

    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag;
    }

    @Basic
    @Column(name = "interest_type")
    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    @Basic
    @Column(name = "grace_days")
    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    @Basic
    @Column(name = "irr")
    public Integer getIrr() {
        return irr;
    }

    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    @Basic
    @Column(name = "lns_rate")
    public Integer getLnsRate() {
        return lnsRate;
    }

    public void setLnsRate(Integer lnsRate) {
        this.lnsRate = lnsRate;
    }

    @Basic
    @Column(name = "channel_code")
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Basic
    @Column(name = "channel_name")
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Basic
    @Column(name = "loan_officer_id")
    public String getLoanOfficerId() {
        return loanOfficerId;
    }

    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId;
    }

  /*  @Basic
    @Column(name = "cityID")
    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityId) {
        this.cityID = cityId;
    }*/

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "is_modify")
    public String getIsModify() {
        return isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify;
    }

    @Basic
    @Column(name = "is_scheme_modify")
    public String getIsSchemeModify() {
        return isSchemeModify;
    }

    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify;
    }

    @Basic
    @Column(name = "recycle_way")
    public Integer getRecycleWay() {
        return recycleWay;
    }

    public void setRecycleWay(Integer recycleWay) {
        this.recycleWay = recycleWay;
    }

    @Basic
    @Column(name = "is_recycle_load")
    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad;
    }

    @Basic
    @Column(name = "recycle_loan_cnt")
    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    @Basic
    @Column(name = "old_contract_num")
    public String getOldContractNum() {
        return oldContractNum;
    }

    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum;
    }

    @Basic
    @Column(name = "settle_amount")
    public Integer getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    @Basic
    @Column(name = "new_contract_num")
    public String getNewContractNum() {
        return newContractNum;
    }

    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum;
    }

    @Basic
    @Column(name = "is_shorten")
    public String getIsShorten() {
        return isShorten;
    }

    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten;
    }

    @Basic
    @Column(name = "is_extend")
    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend;
    }

    @Basic
    @Column(name = "is_change_produce")
    public String getIsChangeProduce() {
        return isChangeProduce;
    }

    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce;
    }

    @Basic
    @Column(name = "is_overdue")
    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    @Basic
    @Column(name = "is_pay_ahead")
    public String getIsPayAhead() {
        return isPayAhead;
    }

    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead;
    }

    @Basic
    @Column(name = "is_pay_part")
    public String getIsPayPart() {
        return isPayPart;
    }

    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart;
    }

    @Basic
    @Column(name = "purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "purpose_son")
    public String getPurposeSon() {
        return purposeSon;
    }

    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon;
    }

    @Basic
    @Column(name = "purpose_detail")
    public String getPurposeDetail() {
        return purposeDetail;
    }

    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail;
    }

    @Basic
    @Column(name = "is_div_account")
    public String getIsDivAccount() {
        return isDivAccount;
    }

    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount;
    }

    @Basic
    @Column(name = "system_type")
    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    @Basic
    @Column(name = "high_risk")
    public String getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk;
    }

    @Basic
    @Column(name = "is_buyout")
    public String getIsBuyout() {
        return isBuyout;
    }

    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout;
    }

    @Basic
    @Column(name = "fee_process_type")
    public String getFeeProcessType() {
        return feeProcessType;
    }

    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType;
    }

    @Basic
    @Column(name = "student_corp_name")
    public String getStudentCorpName() {
        return studentCorpName;
    }

    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName;
    }

    @Basic
    @Column(name = "settle_date")
    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    @Basic
    @Column(name = "habit_time")
    public String getHabitTime() {
        return habitTime;
    }

    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime;
    }

   /* @Basic
    @Column(name = "RepayDay")
    public String getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(String repayDay) {
        this.repayDay = repayDay;
    }*/

    @Basic
    @Column(name = "apply_Id")
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    @Basic
    @Column(name = "old_Apply_Id")
    public String getOldApplyId() {
        return oldApplyId;
    }

    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId;
    }

    @Basic
    @Column(name = "dept_id")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    @Basic
    @Column(name = "FRONT_CHARGE_DISCOUNT")
    public Integer getFrontChargeDiscount() {
        return frontChargeDiscount;
    }

    public void setFrontChargeDiscount(Integer frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }

    @Basic
    @Column(name = "MONTH_M_RATE")
    public Integer getMonthMRate() {
        return monthMRate;
    }

    public void setMonthMRate(Integer monthMRate) {
        this.monthMRate = monthMRate;
    }

    @Basic
    @Column(name = "HANDLE_CHARGE_RATE")
    public Integer getHandleChargeRate() {
        return handleChargeRate;
    }

    public void setHandleChargeRate(Integer handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }

    @Basic
    @Column(name = "LOAN_TIMES")
    public Integer getLoanTimes() {
        return loanTimes;
    }

    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    @Basic
    @Column(name = "PAWN")
    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn;
    }

    @Basic
    @Column(name = "HANDLE_CHARGE")
    public Integer getHandleCharge() {
        return handleCharge;
    }

    public void setHandleCharge(Integer handleCharge) {
        this.handleCharge = handleCharge;
    }

    @Basic
    @Column(name = "MONTH_CHARGE_DISCOUNT")
    public Integer getMonthChargeDiscount() {
        return monthChargeDiscount;
    }

    public void setMonthChargeDiscount(Integer monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }

    @Basic
    @Column(name = "GUARANTEE_FEE")
    public Integer getGuaranteeFee() {
        return guaranteeFee;
    }

    public void setGuaranteeFee(Integer guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }

    @Basic
    @Column(name = "GUARANTEE_COMPANY")
    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany;
    }

    @Basic
    @Column(name = "def1")
    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    @Basic
    @Column(name = "def2")
    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    @Basic
    @Column(name = "def3")
    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    @Basic
    @Column(name = "def4")
    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    @Basic
    @Column(name = "def5")
    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    @Basic
    @Column(name = "def6")
    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    @Basic
    @Column(name = "def7")
    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    @Basic
    @Column(name = "def8")
    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    @Basic
    @Column(name = "def9")
    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    @Basic
    @Column(name = "def10")
    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }


}
