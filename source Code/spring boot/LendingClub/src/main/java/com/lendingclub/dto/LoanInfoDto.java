package com.lendingclub.dto;

import java.util.Date;

public class LoanInfoDto {
	private long id;
	private long memberId;
	private double loanAmnt;
	private double fundedAmntInv;
	private String term;
	private double intRate;
	private double installment;
	private String grade;
	private String emplTitle;
	private String emplLength;
	private String homeOwnership;
	private double annualIncome;
	private String verificationStatus;
	private Date issuedDate;
	private String loanStatus;
	private String desc;
	private String purpose;
	private String title;
	private String addrState;
	private Date lastPaymentDate;
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

	public double getLoanAmnt() {
		return loanAmnt;
	}

	public void setLoanAmnt(double loanAmnt) {
		this.loanAmnt = loanAmnt;
	}

	public String toString() {
		return this.id + "|" + this.memberId + "|" + this.loanAmnt + "|" + this.fundedAmntInv + "|" + this.term + "|"
				+ this.intRate + "|" + this.installment + "|" + this.grade + "|";
	}
}
