package br.com.devsenior.hexagonal.application.core.usecase;

import br.com.devsenior.hexagonal.application.core.domain.Customer;
import br.com.devsenior.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.devsenior.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(Long id) {
        return findCustomerByIdOutputPort.find(id)
        .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
    
}
