//package com.formfield.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.formfield.dao.CustomerDao;
//import com.formfield.model.Customer;
//
//@Controller
//public class CustomerController {
//	@Autowired
//	CustomerDao custdao;
//
//	@RequestMapping("/helloCustomer")
//	public String display(Model m) {
//		m.addAttribute("cust", new Customer());
//		return "CustomerRegistration";
//	}
//
//	@RequestMapping("/register")
//	public String submitForm(@Valid @ModelAttribute("cust") Customer cust, BindingResult br) {
//		if (br.hasErrors()) {
//			return "CustomerRegistration";
//		} else {
//			//new CustomerController().save(cust);
//			custdao.save(cust);
//			return "final";
//		}
//	}
//
//	@RequestMapping("/show")
//	public ModelAndView show() {
//
//		List<Customer> customers=custdao.show();
//		
//		return new ModelAndView("viewpage","cust",customers);
//
//	}
//
//}
