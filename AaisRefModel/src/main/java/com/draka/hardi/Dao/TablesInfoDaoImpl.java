package com.draka.hardi.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;



import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.draka.hardi.Model.Tables;

@Service
public class TablesInfoDaoImpl implements TablesInfo {

	@Autowired
	private DataSource dataSource;


	@Override
	public List<Tables> getAllTables() {
		String query = "select table_name from information_schema.tables where table_schema='dbre'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Tables> empList = new ArrayList<Tables>();

		List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);

		for(Map<String,Object> empRow : empRows){
			Tables emp = new Tables();
			emp.setTableName(String.valueOf(empRow.get("table_name")));
			//emp.setTableColumns(String.valueOf(empRow.get("tableColumns")));
			
			empList.add(emp);
		}
		return empList;
	}

	
	@Override
	public List<Tables> getAllColumns(String var) {
		String query = "SELECT COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS where TABLE_SCHEMA='dbre' and TABLE_NAME='"+var+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Tables> empList = new ArrayList<Tables>();

		List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);

		for(Map<String,Object> empRow : empRows){
			Tables emp = new Tables();
			emp.setTableColumns(String.valueOf(empRow.get("COLUMN_NAME")));
			//emp.setTableColumns(String.valueOf(empRow.get("tableColumns")));
			
			empList.add(emp);
		}
		return empList;
	}
}
