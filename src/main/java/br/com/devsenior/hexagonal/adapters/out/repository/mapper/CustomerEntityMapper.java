package br.com.devsenior.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import br.com.devsenior.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.devsenior.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
    
}
