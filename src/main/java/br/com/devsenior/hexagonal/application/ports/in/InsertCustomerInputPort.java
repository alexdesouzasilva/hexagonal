package br.com.devsenior.hexagonal.application.ports.in;

import br.com.devsenior.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    
    void insert(Customer customer, String zipCode);
}
