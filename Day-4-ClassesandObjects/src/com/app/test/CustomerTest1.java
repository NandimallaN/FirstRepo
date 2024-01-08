package com.app.test;

import com.app.Customer;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer c=new Customer();
        c.insertCustomer();
        
        Customer c1=new Customer();
        c1.insertCustomer();
        
        Customer c2=new Customer();
        c2.insertCustomer();
        
        
        c.showCustomer();
        c1.showCustomer();
        c2.showCustomer();
	}

}
