package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ulsa.model.Demographic;
import com.ulsa.model.Patient;
import com.ulsa.model.Product;


@Controller
public class MyController {

	@GetMapping("/")
	public String homePage() {
		System.out.println("Hola Home");
		return "home";
	}
	
	@GetMapping("/profile")
	public String profilePage(Model model) {
		model.addAttribute("name", "Daniel");
		model.addAttribute("lastName", "Valdez");
		return "profile";
		
	}
	
	@GetMapping("/services")
	public ModelAndView servicesPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("services");
		mav.addObject("company", "karimnot");
		mav.addObject("description", "Empresa de desarrollo de sistemas");
		return mav;		
	}

	@GetMapping("/products")
	public ModelAndView sentToView(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("products");
		mav.addObject("producto", new Product());		
		return mav;		
	}
	
	@GetMapping("/patient")
	public ModelAndView pacientRegister(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("patient");
		mav.addObject("patient", new Patient());		
		return mav;		
	}
	
	@PostMapping("/patients")
	public ModelAndView pacientSubmit(@ModelAttribute Patient patient, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listPatients");
		mav.addObject("patient", patient);			
		return mav;
		
	}
	
	@GetMapping("/demographic")
	public ModelAndView demographicRegister(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("demographic");
		mav.addObject("demographic", new Demographic());		
		return mav;		
	}
	
	@PostMapping("/demographic")
	public ModelAndView demographicSubmit(@ModelAttribute Demographic demographic, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listDemographics");
		mav.addObject("demographic", demographic);			
		return mav;
		
	}
	
	@PostMapping("/products")
	public ModelAndView submitForm(@ModelAttribute Product product, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listProducts");
		mav.addObject("product", product);			
		return mav;
		
	}

}