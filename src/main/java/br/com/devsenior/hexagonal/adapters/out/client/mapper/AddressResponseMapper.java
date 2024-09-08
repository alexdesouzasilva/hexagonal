package br.com.devsenior.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import br.com.devsenior.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.devsenior.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "string")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
    
}
