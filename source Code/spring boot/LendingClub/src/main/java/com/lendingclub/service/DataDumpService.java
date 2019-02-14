package com.lendingclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lendingclub.dto.LoanInfoDto;
import com.lendingclub.repository.DataDumpRepository;

@Service
public class DataDumpService {

	@Autowired
	private DataDumpRepository dataDumpDao;

	public boolean isDataExists() {
		return dataDumpDao.isDataExists();
	}

	public void insertData(List<LoanInfoDto> list) throws Exception {
		dataDumpDao.insertData(list);
	}
}
