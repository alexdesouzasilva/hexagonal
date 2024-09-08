package br.com.devsenior.hexagonal.application.core.usecase;

import br.com.devsenior.hexagonal.application.core.domain.Customer;
import br.com.devsenior.hexagonal.application.ports.in.FindCustomerByIdInputPort;

public class UpdateCustomerUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    }
    
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());

    }
}
