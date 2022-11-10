package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.IbasicBbsDao;
import com.study.springboot.dto.BasicBbsDto;

@Service
public class BasicBbsServiceImpl implements BasicBbsService {

	@Autowired
	IbasicBbsDao dao;
	
	@Override
	public List<BasicBbsDto> list() {
		return dao.listDao();
	}

	@Override
	public BasicBbsDto view(String id) {
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		return dao.writeDao(map);
	}

	@Override
	public int delete(String id) {
		return dao.deleteDao(id);
	}

	@Override
	public int count() {
		return dao.postCount();
	}

}
