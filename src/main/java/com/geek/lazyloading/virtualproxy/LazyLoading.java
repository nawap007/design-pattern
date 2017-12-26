package com.geek.lazyloading.virtualproxy;

import java.util.List;
import java.util.ArrayList;

//Java program to illustrate virtual proxy in Lazy Loading Design Pattern
//http://www.geeksforgeeks.org/lazy-loading-design-pattern/
//Virtual Proxy pattern is a memory saving technique that recommends postponing an object creation until it is needed.
//It is used when creating an object is expensive in terms of memory usage or processing involved.

public class LazyLoading {
	public static void main(String[] args) {
		ContactList contactList = new ContactListProxyImpl();
		Company company = new Company("Geeksforgeeks", "India", "+91-011-28458965", contactList);

		System.out.println("Company Name: " + company.getCompanyName());
		System.out.println("Company Address: " + company.getCompanyAddress());
		System.out.println("Company Contact No.: " + company.getCompanyContactNo());
		System.out.println("Requesting for contact list");

		contactList = company.getContactList();
		List<Employee> empList = contactList.getEmployeeList();
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
