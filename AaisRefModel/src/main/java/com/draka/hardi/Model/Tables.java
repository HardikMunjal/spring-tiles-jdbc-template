package com.draka.hardi.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;


public class Tables{


	
	@Size( min=2 , max=20)
	public String tableName;
	@Size( min=2 , max=20)
	public String tableColumns;
	
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableColumns() {
		return tableColumns;
	}
	public void setTableColumns(String tableColumns) {
		this.tableColumns = tableColumns;
	}
	




	



}
