package br.com.devsenior.hexagonal.application.core.usecase;

import br.com.devsenior.hexagonal.application.core.domain.Customer;
import br.com.devsenior.hexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.devsenior.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.devsenior.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
        FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
        InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
