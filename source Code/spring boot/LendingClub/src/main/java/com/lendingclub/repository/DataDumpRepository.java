package com.lendingclub.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lendingclub.dto.LoanInfoDto;

@Repository
@Transactional
public class DataDumpRepository extends CommonRepository {
	String insertQuery = "insert into LOAN_INFO values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public boolean isDataExists() {
		int count = ((Long) getSession().createQuery("select count(*) from LoanInfo").uniqueResult()).intValue();

		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void insertData(List<LoanInfoDto> list) throws Exception {
		int id = 1;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(insertQuery);
			for (int i = 0; i < list.size(); i++) {
				int index = 1;
				LoanInfoDto dto = list.get(i);
				ps.setLong(index++, id++);
				ps.setString(index++, dto.getAddrState());
				ps.setDouble(index++, dto.getAnnualIncome());
				ps.setString(index++, dto.getDesc());
				ps.setString(index++, dto.getEmplLength());
				ps.setString(index++, dto.getEmplTitle());
				ps.setDouble(index++, dto.getFundedAmntInv());
				ps.setString(index++, dto.getGrade());
				ps.setString(index++, dto.getHomeOwnership());
				ps.setDouble(index++, dto.getInstallment());
				ps.setDouble(index++, dto.getIntRate());
				Date issuedDate=null;
				if(dto.getIssuedDate()!=null) {
				issuedDate = new Date(dto.getIssuedDate().getTime());
				}
				ps.setDate(index++, issuedDate);
				ps.setDouble(index++, dto.getLastPaymentAmnt());
				Date lastPaymentDate = null;
				if(dto.getLastPaymentDate()!=null) {
					lastPaymentDate=new Date(dto.getLastPaymentDate().getTime());
				}
				ps.setDate(index++, lastPaymentDate);
				ps.setDouble(index++, dto.getLoanAmnt());
				ps.setString(index++, dto.getLoanStatus());
				ps.setLong(index++, dto.getMemberId());
				ps.setString(index++, dto.getPurpose());
				ps.setString(index++,dto.getTerm());
				ps.setString(index++,dto.getTitle());
				ps.setString(index++,dto.getVerificationStatus());
				ps.addBatch();
			}
			ps.executeBatch();
			con.commit();
		} catch (Exception exc) {
			con.rollback();
			throw new Exception(exc);
		}finally {
			con.close();
		}

	}
}
