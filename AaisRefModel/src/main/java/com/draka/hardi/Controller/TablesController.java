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
import org.springframework.web.bind.annotation.ResponseBody;
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


		
		ModelAndView modelAndView = new ModelAndView("Meta4");
		modelAndView.addObject("students", tables);
		return modelAndView;
	}
	
	
	//@RequestMapping(value = "/result", method = RequestMethod.POST)
	 //public @ResponseBody
	@RequestMapping(value = "/result", method = RequestMethod.GET)
    public @ResponseBody
    java.util.List<String> showstates(@RequestParam("dropdown") String dropdown) {
        java.util.List<String> statelist = new ArrayList<String>();
        
            statelist.add("Alaska");
            statelist.add("Texas");
            statelist.add("California");
            statelist.add("Montana");
            statelist.add("New Mexico");
        
            statelist.add("Bedfordshire");
            statelist.add("Berkshire");
            statelist.add("Lancashire");
            statelist.add("Kent");
            statelist.add("Nottinghamshire");
        
            statelist.add("Maharashtra");
            statelist.add("West Bengal");
            statelist.add("Karnataka");
            statelist.add("Andhra Pradesh");
            statelist.add("Tamil Nadu");
       
            statelist.add("Moscow");
            statelist.add("Saint Petersburg");
            statelist.add("Novosibirsk");
            statelist.add("Yekaterinburg");
            statelist.add("Nizhny Novgorod");
        
        return statelist;
	}
	
	   @RequestMapping(value = "/count", method = RequestMethod.GET)
	     public String showCountries(Model model) {
	         java.util.List<String> countries = new ArrayList<String>();
	         countries.add("");
	         countries.add("India");
	         countries.add("Russia");
	         countries.add("United Kingdom");
	         countries.add("United States");
	         model.addAttribute("countrylist", countries);
	         return "entryform";
	     }
	 
	     @RequestMapping(value = "/getstates", method = RequestMethod.GET)
	     public @ResponseBody
	     java.util.List<String> showstates2(@RequestParam("country") String country){
	         java.util.List<String> statelist = new ArrayList<String>();
	         if (country.equals("United States")) {
	             statelist.add("Alaska");
	             statelist.add("Texas");
	             statelist.add("California");
	             statelist.add("Montana");
	             statelist.add("New Mexico");
	         } else if (country.equals("United Kingdom")) {
	             statelist.add("Bedfordshire");
	             statelist.add("Berkshire");
	             statelist.add("Lancashire");
	             statelist.add("Kent");
	             statelist.add("Nottinghamshire");
	         } else if (country.equals("India")) {
	             statelist.add("Maharashtra");
	             statelist.add("West Bengal");
	             statelist.add("Karnataka");
	             statelist.add("Andhra Pradesh");
	             statelist.add("Tamil Nadu");
	         } else if (country.equals("Russia")) {
	             statelist.add("Moscow");
	             statelist.add("Saint Petersburg");
	             statelist.add("Novosibirsk");
	             statelist.add("Yekaterinburg");
	             statelist.add("Nizhny Novgorod");
	         }
	         return statelist;
	     }
}