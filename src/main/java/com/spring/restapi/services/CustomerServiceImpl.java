/*
 * package com.spring.restapi.services;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.spring.restapi.models.Customer; import
 * com.spring.restapi.repositories.CustomerRepository;
 * 
 * @Service public class CustomerServiceImpl implements CustomerService {
 * 
 * @Autowired private CustomerRepository customerRepository;
 * 
 * @Override public void createCustomer(Customer customer) { //
 * TODOAuto-generated method stub customerRepository.save(customer); }
 * 
 * @Override public List<Customer> getAllCustomers() { // TODO Auto-generated
 * method stub return customerRepository.findAll(); }
 * 
 * @Override public Optional<Customer> getOneCustomer(int id) { return
 * customerRepository.findById(id); }
 * 
 * }
 */