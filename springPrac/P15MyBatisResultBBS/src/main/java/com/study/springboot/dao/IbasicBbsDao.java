package com.study.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.BasicBbsDto;

@Mapper
public interface IbasicBbsDao {
	public List<BasicBbsDto> listDao();
	public BasicBbsDto viewDao(String id);
	public int writeDao(Map<String, String> map);
	public int deleteDao(@Param("_id") String id);
	public int postCount();
}
