package com.atguigu.financial.bean;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "nplm_borrower_info", schema = "financial", catalog = "")
public class NplmBorrowerInfoEntity implements Serializable{
    private String id;
    private Integer applyClientId;
    private Integer ecifId;
    private String clientName;
    private String mobile;
    private String oldName;
    private String sex;
    private String nation;
    private String birthday;
    private String marital;
    private Integer haveChildren;
    private Integer childrenCount;
    private String nationality;
    private String hProvince;
    private String hCity;
    private String hDress;
    private String identityType;
    private String identityNum;
    private String identityValidDate;
    private String haveCar;
    private String houseExplain;
    private String resideExplain;
    private String resideYear;
    private String degree;
    private String diploma;
    private Integer yearIncome;
    private String industry;
    private String job;
    private String company;
    private String companyType;
    private String department;
    private String position;
    private Integer workTime;
    private String workTimeUnit;
    private String clientArea;
    private String clientType;
    private String fNation;
    private String fProvince;
    private String fCity;
    private String fArea;
    private String fStreet;
    private String fZipcode;
    private String cNation;
    private String cProvince;
    private String cCity;
    private String cArea;
    private String cStreet;
    private String cZipcode;
    private String mobile1;
    private String mobile2;
    private String mobile3;
    private String fTel1;
    private String fTel2;
    private String fTel3;
    private String cTel1;
    private String cTel2;
    private String cTel3;
    private String email1;
    private String email2;
    private String email3;
    private Integer creditAmount;
    private String sociallSecurity;
    private String creator;
    private String createTime;
    private String updater;
    private String updateTime;
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
    @Column(name = "APPLY_CLIENT_ID")
    public Integer getApplyClientId() {
        return applyClientId;
    }

    public void setApplyClientId(Integer applyClientId) {
        this.applyClientId = applyClientId;
    }

    @Basic
    @Column(name = "ECIF_ID")
    public Integer getEcifId() {
        return ecifId;
    }

    public void setEcifId(Integer ecifId) {
        this.ecifId = ecifId;
    }

    @Basic
    @Column(name = "CLIENT_NAME")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "OLD_NAME")
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "NATION")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "BIRTHDAY")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "MARITAL")
    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    @Basic
    @Column(name = "HAVE_CHILDREN")
    public Integer getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    @Basic
    @Column(name = "CHILDREN_COUNT")
    public Integer getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    @Basic
    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "H_PROVINCE")
    public String gethProvince() {
        return hProvince;
    }

    public void sethProvince(String hProvince) {
        this.hProvince = hProvince;
    }

    @Basic
    @Column(name = "H_CITY")
    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    @Basic
    @Column(name = "H_DRESS")
    public String gethDress() {
        return hDress;
    }

    public void sethDress(String hDress) {
        this.hDress = hDress;
    }

    @Basic
    @Column(name = "IDENTITY_TYPE")
    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    @Basic
    @Column(name = "IDENTITY_NUM")
    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    @Basic
    @Column(name = "IDENTITY_VALID_DATE")
    public String getIdentityValidDate() {
        return identityValidDate;
    }

    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate;
    }

    @Basic
    @Column(name = "HAVE_CAR")
    public String getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(String haveCar) {
        this.haveCar = haveCar;
    }

    @Basic
    @Column(name = "HOUSE_EXPLAIN")
    public String getHouseExplain() {
        return houseExplain;
    }

    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain;
    }

    @Basic
    @Column(name = "RESIDE_EXPLAIN")
    public String getResideExplain() {
        return resideExplain;
    }

    public void setResideExplain(String resideExplain) {
        this.resideExplain = resideExplain;
    }

    @Basic
    @Column(name = "RESIDE_YEAR")
    public String getResideYear() {
        return resideYear;
    }

    public void setResideYear(String resideYear) {
        this.resideYear = resideYear;
    }

    @Basic
    @Column(name = "DEGREE")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "DIPLOMA")
    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    @Basic
    @Column(name = "YEAR_INCOME")
    public Integer getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Integer yearIncome) {
        this.yearIncome = yearIncome;
    }

    @Basic
    @Column(name = "INDUSTRY")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "COMPANY")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "COMPANY_TYPE")
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    @Basic
    @Column(name = "DEPARTMENT")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "POSITION")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "WORK_TIME")
    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    @Basic
    @Column(name = "WORK_TIME_UNIT")
    public String getWorkTimeUnit() {
        return workTimeUnit;
    }

    public void setWorkTimeUnit(String workTimeUnit) {
        this.workTimeUnit = workTimeUnit;
    }

    @Basic
    @Column(name = "CLIENT_AREA")
    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea;
    }

    @Basic
    @Column(name = "CLIENT_TYPE")
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @Basic
    @Column(name = "F_NATION")
    public String getfNation() {
        return fNation;
    }

    public void setfNation(String fNation) {
        this.fNation = fNation;
    }

    @Basic
    @Column(name = "F_PROVINCE")
    public String getfProvince() {
        return fProvince;
    }

    public void setfProvince(String fProvince) {
        this.fProvince = fProvince;
    }

    @Basic
    @Column(name = "F_CITY")
    public String getfCity() {
        return fCity;
    }

    public void setfCity(String fCity) {
        this.fCity = fCity;
    }

    @Basic
    @Column(name = "F_AREA")
    public String getfArea() {
        return fArea;
    }

    public void setfArea(String fArea) {
        this.fArea = fArea;
    }

    @Basic
    @Column(name = "F_STREET")
    public String getfStreet() {
        return fStreet;
    }

    public void setfStreet(String fStreet) {
        this.fStreet = fStreet;
    }

    @Basic
    @Column(name = "F_ZIPCODE")
    public String getfZipcode() {
        return fZipcode;
    }

    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode;
    }

    @Basic
    @Column(name = "C_NATION")
    public String getcNation() {
        return cNation;
    }

    public void setcNation(String cNation) {
        this.cNation = cNation;
    }

    @Basic
    @Column(name = "C_PROVINCE")
    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    @Basic
    @Column(name = "C_CITY")
    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    @Basic
    @Column(name = "C_AREA")
    public String getcArea() {
        return cArea;
    }

    public void setcArea(String cArea) {
        this.cArea = cArea;
    }

    @Basic
    @Column(name = "C_STREET")
    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet;
    }

    @Basic
    @Column(name = "C_ZIPCODE")
    public String getcZipcode() {
        return cZipcode;
    }

    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
    }

    @Basic
    @Column(name = "MOBILE1")
    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    @Basic
    @Column(name = "MOBILE2")
    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    @Basic
    @Column(name = "MOBILE3")
    public String getMobile3() {
        return mobile3;
    }

    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3;
    }

    @Basic
    @Column(name = "F_TEL1")
    public String getfTel1() {
        return fTel1;
    }

    public void setfTel1(String fTel1) {
        this.fTel1 = fTel1;
    }

    @Basic
    @Column(name = "F_TEL2")
    public String getfTel2() {
        return fTel2;
    }

    public void setfTel2(String fTel2) {
        this.fTel2 = fTel2;
    }

    @Basic
    @Column(name = "F_TEL3")
    public String getfTel3() {
        return fTel3;
    }

    public void setfTel3(String fTel3) {
        this.fTel3 = fTel3;
    }

    @Basic
    @Column(name = "C_TEL1")
    public String getcTel1() {
        return cTel1;
    }

    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1;
    }

    @Basic
    @Column(name = "C_TEL2")
    public String getcTel2() {
        return cTel2;
    }

    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2;
    }

    @Basic
    @Column(name = "C_TEL3")
    public String getcTel3() {
        return cTel3;
    }

    public void setcTel3(String cTel3) {
        this.cTel3 = cTel3;
    }

    @Basic
    @Column(name = "EMAIL1")
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    @Basic
    @Column(name = "EMAIL2")
    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @Basic
    @Column(name = "EMAIL3")
    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    @Basic
    @Column(name = "CREDIT_AMOUNT")
    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Basic
    @Column(name = "SOCIALl_SECURITY")
    public String getSociallSecurity() {
        return sociallSecurity;
    }

    public void setSociallSecurity(String sociaLlSecurity) {
        this.sociallSecurity = sociaLlSecurity;
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
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
