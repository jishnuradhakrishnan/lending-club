package com.lendingclub.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN_INFO")
public class LoanInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "member_id")
	private long memberId;

	@Column(name = "loan_amnt")
	private double loanAmnt;

	@Column(name = "funded_amnt_inv")
	private double fundedAmntInv;

	@Column(name = "term", length = 3000)
	private String term;

	@Column(name = "int_rate")
	private double intRate;

	@Column(name = "installment")
	private double installment;

	@Column(name = "grade", length = 3000)
	private String grade;

	@Column(name = "empl_title", length = 3000)
	private String emplTitle;

	@Column(name = "empl_length", length = 3000)
	private String emplLength;

	@Column(name = "home_ownership", length = 3000)
	private String homeOwnership;

	@Column(name = "annual_income")
	private double annualIncome;

	@Column(name = "verification_status", length = 3000)
	private String verificationStatus;

	@Column(name = "issued_date")
	private Date issuedDate;

	@Column(name = "loan_status", length = 3000)
	private String loanStatus;

	@Column(name = "`desc`", length = 5000)
	private String desc;

	@Column(name = "purpose", length = 3000)
	private String purpose;

	@Column(name = "title", length = 3000)
	private String title;

	@Column(name = "addr_state", length = 3000)
	private String addrState;

	@Column(name = "last_payment_date")
	private Date lastPaymentDate;

	@Column(name = "last_payment_amnt")
	private double lastPaymentAmnt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public double getLoanAmnt() {
		return loanAmnt;
	}

	public void setLoanAmnt(double loanAmnt) {
		this.loanAmnt = loanAmnt;
	}

	public double getFundedAmntInv() {
		return fundedAmntInv;
	}

	public void setFundedAmntInv(double fundedAmntInv) {
		this.fundedAmntInv = fundedAmntInv;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}

	public double getInstallment() {
		return installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEmplTitle() {
		return emplTitle;
	}

	public void setEmplTitle(String emplTitle) {
		this.emplTitle = emplTitle;
	}

	public String getEmplLength() {
		return emplLength;
	}

	public void setEmplLength(String emplLength) {
		this.emplLength = emplLength;
	}

	public String getHomeOwnership() {
		return homeOwnership;
	}

	public void setHomeOwnership(String homeOwnership) {
		this.homeOwnership = homeOwnership;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddrState() {
		return addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public double getLastPaymentAmnt() {
		return lastPaymentAmnt;
	}

	public void setLastPaymentAmnt(double lastPaymentAmnt) {
		this.lastPaymentAmnt = lastPaymentAmnt;
	}

}
