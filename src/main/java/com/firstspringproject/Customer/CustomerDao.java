package com.firstspringproject.Customer;

public class CustomerDao implements DataAccess<Customer>{

	@Override
	public String save(Customer Obj) {
		System.out.println(Obj.getId());
		System.out.println(Obj.getName());
		System.out.println(Obj.getAddress());
		return "success";
	}

}
