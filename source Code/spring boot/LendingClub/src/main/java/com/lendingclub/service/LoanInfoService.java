package com.lendingclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lendingclub.dto.LoanInfoDto;
import com.lendingclub.repository.LoanInfoRepository;

@Service
public class LoanInfoService {
	// for each request it will return data up to 10 records
	private int baseLimit = 10;

	@Autowired
	private LoanInfoRepository infoRepository;

	public long getPageLimit() {
		long pageLimit = 0;
		long count = infoRepository.getDataCount();
		if (count % baseLimit == 0) {
			pageLimit = count / baseLimit;
		} else {
			// removing the decimal places
			pageLimit = (int) count / baseLimit;
			pageLimit++;
		}

		return pageLimit;
	}

	public List<LoanInfoDto> getList(int pageNum) {
		int startIndex = (pageNum - 1) * this.baseLimit;
		return infoRepository.getList(startIndex, this.baseLimit);
	}

	public LoanInfoDto getInfo(int id) {
		return infoRepository.getInfo(id);
	}
}
