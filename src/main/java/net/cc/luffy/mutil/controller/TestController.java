package net.cc.luffy.mutil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.cc.luffy.mutil.test1.mapper.Test1Mapper;
import net.cc.luffy.mutil.test2.mapper.Test2Mapper;

@RestController
public class TestController {

	@Autowired
	private Test1Mapper test1Mapper;

	@Autowired
	private Test2Mapper test2Mapper;

	@GetMapping("/test1")
	public String getUidById(@RequestParam(name = "id", required = false) int id) {
		return test1Mapper.getUidById(id);
	}

	@GetMapping("/test2")
	public String getMoBileTypeByImei(@RequestParam(name = "imei", required = false) String imei) {
		return test2Mapper.getMoBileTypeByImei(imei);
	}


}
