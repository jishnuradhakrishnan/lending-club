package com.lendingclub.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.lendingclub.dto.LoanInfoDto;
import com.lendingclub.entity.LoanInfo;

@Repository
public class LoanInfoRepository extends CommonRepository {

	public long getDataCount() {
		String query = "select count(*) from LoanInfo";
		long count = (long) getSession().createQuery(query).uniqueResult();
		return count;
	}

	@SuppressWarnings("unchecked")
	public List<LoanInfoDto> getList(int startIndex, int baseLimit) {
		@SuppressWarnings("rawtypes")
		Query query = getSession().createQuery("from LoanInfo limit");
		query.setFirstResult(startIndex);
		query.setMaxResults(baseLimit);
		List<LoanInfoDto> list = new ArrayList<LoanInfoDto>();
		List<LoanInfo> entityList = new ArrayList<LoanInfo>();
		entityList = query.list();
		entityList.forEach((v) -> {
			LoanInfoDto dto = new LoanInfoDto();
			dto.setId(v.getId());
			dto.setAddrState(v.getAddrState());
			dto.setAnnualIncome(v.getAnnualIncome());
			dto.setDesc(v.getDesc());
			dto.setEmplLength(v.getEmplLength());
			dto.setEmplTitle(v.getEmplTitle());
			dto.setFundedAmntInv(v.getFundedAmntInv());
			dto.setGrade(v.getGrade());
			dto.setHomeOwnership(v.getHomeOwnership());
			dto.setInstallment(v.getInstallment());
			dto.setIntRate(v.getIntRate());
			dto.setIssuedDate(v.getIssuedDate());
			dto.setLastPaymentAmnt(v.getLastPaymentAmnt());
			dto.setLastPaymentDate(v.getLastPaymentDate());
			dto.setLoanAmnt(v.getLoanAmnt());
			dto.setLoanStatus(v.getLoanStatus());
			dto.setMemberId(v.getMemberId());
			dto.setPurpose(v.getPurpose());
			dto.setTerm(v.getTerm());
			dto.setTitle(v.getTitle());
			dto.setVerificationStatus(v.getVerificationStatus());
			list.add(dto);
		});

		return list;
	}

	public LoanInfoDto getInfo(int id) {
		LoanInfoDto dto = new LoanInfoDto();
		String query = "from LoanInfo where id=" + id;
		LoanInfo v = (LoanInfo) getSession().createQuery(query).uniqueResult();
		dto.setId(v.getId());
		dto.setAddrState(v.getAddrState());
		dto.setAnnualIncome(v.getAnnualIncome());
		dto.setDesc(v.getDesc());
		dto.setEmplLength(v.getEmplLength());
		dto.setEmplTitle(v.getEmplTitle());
		dto.setFundedAmntInv(v.getFundedAmntInv());
		dto.setGrade(v.getGrade());
		dto.setHomeOwnership(v.getHomeOwnership());
		dto.setInstallment(v.getInstallment());
		dto.setIntRate(v.getIntRate());
		dto.setIssuedDate(v.getIssuedDate());
		dto.setLastPaymentAmnt(v.getLastPaymentAmnt());
		dto.setLastPaymentDate(v.getLastPaymentDate());
		dto.setLoanAmnt(v.getLoanAmnt());
		dto.setLoanStatus(v.getLoanStatus());
		dto.setMemberId(v.getMemberId());
		dto.setPurpose(v.getPurpose());
		dto.setTerm(v.getTerm());
		dto.setTitle(v.getTitle());
		dto.setVerificationStatus(v.getVerificationStatus());
		return dto;
	}
}
