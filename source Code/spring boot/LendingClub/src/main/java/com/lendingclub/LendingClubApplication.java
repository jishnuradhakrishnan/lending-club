package com.lendingclub;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lendingclub.dto.LoanInfoDto;
import com.lendingclub.service.DataDumpService;
import com.lendingclub.util.CSVReader;

@SpringBootApplication
public class LendingClubApplication {

	@Autowired
	private CSVReader csvReader;

	@Autowired
	private DataDumpService dataDumpService;

	public static void main(String[] args) {
		SpringApplication.run(LendingClubApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@PostConstruct
	public void doInsert() throws Exception {
		List<LoanInfoDto> list = csvReader.read();
		if (!dataDumpService.isDataExists()) {
			dataDumpService.insertData(list);
		}
		/*
		 * list.forEach((k) -> { System.out.println(k.toString()); });
		 */
	}
}
