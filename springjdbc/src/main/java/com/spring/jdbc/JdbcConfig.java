package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/springjdbc?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("Aquib");
		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
		
	}

}
