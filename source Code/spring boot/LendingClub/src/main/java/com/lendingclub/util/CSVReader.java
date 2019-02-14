package com.lendingclub.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.lendingclub.dto.LoanInfoDto;
@Component
public class CSVReader {
	public List<LoanInfoDto> read() {
		List<LoanInfoDto> list = new ArrayList<LoanInfoDto>();
		CSVParser csvParser = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("MMM-yyyy");
			ClassPathResource res = new ClassPathResource("loan_part_0009b606f.csv");
			BufferedReader reader = new BufferedReader(new InputStreamReader(res.getInputStream(), "UTF-8"));
			// for skipping the headings
			reader.readLine();
			csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
			for (CSVRecord record : csvParser) {
				LoanInfoDto info = new LoanInfoDto();
				info.setMemberId(Long.parseLong(record.get(0)));
				info.setLoanAmnt(Double.parseDouble(record.get(1)));
				info.setFundedAmntInv(Double.parseDouble(record.get(2)));
				info.setTerm(record.get(3));
				info.setIntRate(Double.parseDouble(record.get(4)));
				info.setInstallment(Double.parseDouble(record.get(5)));
				info.setGrade(record.get(6));
				info.setEmplTitle(record.get(7));
				info.setEmplLength(record.get(8));
				info.setHomeOwnership(record.get(9));
				info.setAnnualIncome(Double.parseDouble(record.get(10)));
				info.setVerificationStatus(record.get(11));
				info.setIssuedDate(df.parse(record.get(12)));
				info.setLoanStatus(record.get(13));
				info.setDesc(record.get(14));
				info.setPurpose(record.get(15));
				info.setTitle(record.get(16));
				info.setAddrState(record.get(17));
				String str=record.get(18);
				if(!str.equals("")) {
					if(!str.equals("0")) {
						info.setLastPaymentDate(df.parse(str));
					}
				}
				info.setLastPaymentAmnt(Double.parseDouble(record.get(19)));

				list.add(info);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				csvParser.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	}
}
