package com.study.springboot.dao;

import java.util.List;

import com.study.springboot.dto.BasicBbsDto;

public interface IbasicBbsDao {
	public List<BasicBbsDto> listDao();
	public BasicBbsDto viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int deleteDao(String id);
}
