package com.spring.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.restapi.config.CaptchaUtil;
import com.spring.restapi.models.Customer;
import com.spring.restapi.services.CustomerService;

import cn.apiclub.captcha.Captcha;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/register")
	public String registercustomer(Model model) {
		Customer customer = new Customer();
		getCaptcha(customer);
		model.addAttribute("customer", customer);
		return "registerCustomer";
		
	}
	@PostMapping("/save")
	public String savecustomer(@ModelAttribute Customer customer,Model model) {
		if(customer.getCaptcha().equals(customer.getHiddenCaptcha())) {
			customerService.createCustomer(customer);
			model.addAttribute("message", "customer Registered successfully!");
			return "redirect:weather";
		} 
		else {
			model.addAttribute("message", "Invalid Captcha");
			getCaptcha(customer);
			model.addAttribute("customer", customer);
		}
		return "registerCustomer";
		
	}
	
	@GetMapping("/allcustomers")
	public String getAllcustomers(Model model) {
		List<Customer> customerList= customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);
		return "listcustomers";
	}
	
	public void getCaptcha(Customer customer) {
		Captcha captcha = CaptchaUtil.createCaptcha(240, 70);
		customer.setHiddenCaptcha(captcha.getAnswer());
		customer.setCaptcha("");//value entered by customer will be stored
		customer.setRealCaptcha(CaptchaUtil.encodeCaptcha(captcha));
	}
	
	
}