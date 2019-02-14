package com.lendingclub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lendingclub.dto.LoanInfoDto;
import com.lendingclub.service.LoanInfoService;

@RestController
@RequestMapping("/loanInfo")
@CrossOrigin(origins = "http://localhost:4200")
public class LoanInfoController {
	@Autowired
	private ObjectMapper mapper;
	@Autowired
	private LoanInfoService infoService;

	@RequestMapping(value = "/pageLimit", method = RequestMethod.GET)
	public JsonNode getPageLimit() {
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("pageLimit", infoService.getPageLimit());
		return objectNode;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JsonNode getList(@RequestParam("pageNum") int num) {
		List<LoanInfoDto> list = infoService.getList(num);
		ArrayNode arrayNode = mapper.convertValue(list, ArrayNode.class);

		return arrayNode;
	}

	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	public JsonNode getInfo(@RequestParam("id") int id) {
		LoanInfoDto infoDto = infoService.getInfo(id);
		ObjectNode objectNode = mapper.convertValue(infoDto, ObjectNode.class);

		return objectNode;
	}

}
