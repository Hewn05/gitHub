package com.study.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springboot.dto.BasicBbsDto;

@Repository
public class BasicBbsDao implements IbasicBbsDao{

	@Autowired
	JdbcTemplate jtemplete;
	
	@Override
	public List<BasicBbsDto> listDao() {
		
		System.out.println("listDao()");
		String query = "SELECT * FROM BASIC_BBS ORDER BY ID DESC";
		List<BasicBbsDto> dtos = jtemplete.query(query, new BeanPropertyRowMapper<BasicBbsDto>(BasicBbsDto.class));
		
		return dtos;
	}

	@Override
	public BasicBbsDto viewDao(String id) {
		
		System.out.println("viewDao()");
		String query = "SELECT * FROM BASIC_BBS WHERE ID=" + id;
		BasicBbsDto dto = jtemplete.queryForObject(query, new BeanPropertyRowMapper<BasicBbsDto>(BasicBbsDto.class));
		
		return dto;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writeDao()");
		String query="INSERT INTO BASIC_BBS(ID, WRITER, TITLE, CONTENT)" + 
					" VALUES(BASIC_BBS_SEQ.NEXTVAL, ?, ?, ?)";
				
		return jtemplete.update(query, writer, title, content);
	}

	@Override
	public int deleteDao(String id) {
		System.out.println("deleteDao()");
		String query = "DELETE FROM BASIC_BBS WHERE ID=?";
		
		return jtemplete.update(query,Integer.parseInt(id));
	}
	
}
