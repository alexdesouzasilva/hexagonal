package br.com.devsenior.hexagonal.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.devsenior.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.devsenior.hexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.devsenior.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCusomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
    
}
