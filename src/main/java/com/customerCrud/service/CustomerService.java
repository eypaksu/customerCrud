package com.customerCrud.service;

import java.util.List;

import com.customerCrud.dao.CustomerDAO;
import com.customerCrud.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public void deleteCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public Customer getCustomerById(int id);

	public List<Customer> getCustomers();

	public CustomerDAO getCustomerDAO();

	public void setCustomerDAO(CustomerDAO customerDAO);
}
