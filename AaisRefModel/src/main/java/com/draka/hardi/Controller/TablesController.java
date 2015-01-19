package com.draka.hardi.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;










import com.draka.hardi.Dao.TablesInfoDaoImpl;
import com.draka.hardi.Model.Tables;

import antlr.collections.List;

import java.util.*;

import javax.sql.DataSource;

@Controller
public class TablesController {

	@Autowired
	private DataSource dataSource;
	@Autowired
	public TablesInfoDaoImpl tablesInfoDaoImpl;


	@RequestMapping(value = "/student.html", method = RequestMethod.GET)
	public ModelAndView show_users(Model model)
	{

		java.util.List<Tables> tables =tablesInfoDaoImpl.getAllTables();


		ModelAndView modelAndView = new ModelAndView("Meta");
		modelAndView.addObject("students", tables);
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView show_users2(@RequestParam String dropdown,Model model)
	{

		java.util.List<Tables> tables =tablesInfoDaoImpl.getAllColumns(dropdown);


		ModelAndView modelAndView = new ModelAndView("Meta");
		modelAndView.addObject("students", tables);
		return modelAndView;
	}
	
	
}
