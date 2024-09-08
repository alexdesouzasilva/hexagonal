package br.com.devsenior.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.devsenior.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.devsenior.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.devsenior.hexagonal.application.core.domain.Address;
import br.com.devsenior.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

//O Adapter nada mais é que a implementação da porta de saída e entrada
@Component
public class FindAddressByZipCode implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
