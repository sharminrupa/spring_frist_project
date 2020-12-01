package com.firstspringproject.Customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@PostMapping("/save")
	public String save(HttpServletRequest req){
		
		DataAccess da = new CustomerDao();
		Customer cs = new Customer();
		String id = req.getParameter("id");
		Long uid = Long.parseLong(id);
		String name = req.getParameter("name");
		String address = req.getParameter("address");		
		
		cs.setId(uid);
		cs.setName(name);
		cs.setAddress(address);
		da.save(cs);
		return "show";
	}

}
