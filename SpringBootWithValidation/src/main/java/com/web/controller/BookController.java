package com.web.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Book;

@Controller
public class BookController {
	
	 @InitBinder
	    public void initBinder(WebDataBinder dataBinder) {

	        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

	        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	    }


	@RequestMapping("/")
	public String book(Model m) {
		Book b = new Book();
		m.addAttribute("books",b);
		return "book";
	}
	
	@RequestMapping("/process")
	public String process(@Valid @ModelAttribute("books") Book book,BindingResult result) {
		if(result.hasErrors()) {
			return "book";
		}
		else {
			return "book-data";
		}
		
	}
}
