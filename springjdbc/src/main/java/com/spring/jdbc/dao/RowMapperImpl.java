package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	Student student = new Student();
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getString(3));
		
		return student;
	}

}
