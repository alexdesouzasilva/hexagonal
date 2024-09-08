package br.com.devsenior.hexagonal.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.devsenior.hexagonal.adapters.out.repository.CustomerRepository;
import br.com.devsenior.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.devsenior.hexagonal.application.core.domain.Customer;
import br.com.devsenior.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(Long id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
    
}
