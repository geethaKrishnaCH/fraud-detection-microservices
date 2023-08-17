package com.easylearnz.customer.service;

import com.easylearnz.customer.dto.CustomerRegistrationRequest;
import com.easylearnz.customer.model.Customer;
import com.easylearnz.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        // todo: check email validity
        // todo: check if email not taken
        // todo: create a customer in db
        customerRepository.save(customer);
    }
}
