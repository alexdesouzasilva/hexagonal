package br.com.devsenior.hexagonal.application.ports.out;

import java.util.Optional;

import br.com.devsenior.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {
    
    Optional<Customer> find(Long id);
}
