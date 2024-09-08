package br.com.devsenior.hexagonal.application.ports.in;

import br.com.devsenior.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    
    Customer find(Long id);
}
