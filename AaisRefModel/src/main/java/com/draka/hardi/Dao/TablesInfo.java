package com.draka.hardi.Dao;

import java.util.List;

import com.draka.hardi.Model.*;

public interface TablesInfo 
{
	public List<Tables> getAllTables();
	public List<Tables> getAllColumns(String var);
}
