package br.com.devsenior.hexagonal.application.ports.out;

import br.com.devsenior.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
    
}
