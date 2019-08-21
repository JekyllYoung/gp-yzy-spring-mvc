package com.gupaoedu.vip.spring.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.gupaoedu.vip.spring.demo.service.IQueryService;
import com.gupaoedu.vip.spring.formework.annotation.GPService;
import lombok.extern.slf4j.Slf4j;

/**
 * 查询业务
 * @author yzy
 *
 */
@GPService
@Slf4j
public class QueryService implements IQueryService {

	/**
	 * 查询
	 */
	public String query(String name) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		String json = "{name:\"" + name + "\",time:\"" + time + "\"}";
		return json;
	}

}
