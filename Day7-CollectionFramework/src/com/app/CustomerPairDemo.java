package com.app;

import java.util.ArrayList;

public class CustomerPairDemo {

	public static void main(String[] args) {
		

		Pair<String, Integer> p1=new CustomerPair<String, Integer>("TCS",1);
		 System.out.println(p1.getKey()+"   "+p1.getValue());
		 
		 
		 Pair<String, String> p2=new CustomerPair<String, String>("TCS","HYD");
		 System.out.println(p2.getKey()+"   "+p2.getValue());
		

	}

}
