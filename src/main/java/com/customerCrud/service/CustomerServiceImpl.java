package com.customerCrud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerCrud.dao.CustomerDAO;
import com.customerCrud.model.Customer;

/**
 *
 * Customer Service
 *
 * @author Eyup
 *
 *
 */
@Service("CustomerService")
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    // CustomerDAO is injected...
    @Autowired
    CustomerDAO customerDAO;

    /**
     * Add Customer
     *
     * @param  customer Customer
     */
    @Transactional(readOnly = false)
    public void addCustomer(Customer customer) {
        getCustomerDAO().addCustomer(customer);
    }

    /**
     * Delete Customer
     *
     * @param   customer  Customer
     */
    @Transactional(readOnly = false)
    public void deleteCustomer(Customer customer) {
        getCustomerDAO().deleteCustomer(customer);
    }

    /**
     * Update Customer
     *
     * @param customer  Customer
     */
    @Transactional(readOnly = false)
    public void updateCustomer(Customer customer) {
        getCustomerDAO().updateCustomer(customer);
    }

    /**
     * Get Customer
     *
     * @param  id int Customer Id
     */

    public Customer getCustomerById(int id) {
        return getCustomerDAO().getCustomerById(id);
    }

    /**
     * Get Customer List
     *
     */

    public List<Customer> getCustomers() {
        return getCustomerDAO().getCustomers();
    }

    /**
     * Get Customer DAO
     *
     * @return customerDAO - Customer DAO
     */
    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    /**
     * Set Customer DAO
     *
     * @param  customerDAO - CustomerDAO
     */
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
