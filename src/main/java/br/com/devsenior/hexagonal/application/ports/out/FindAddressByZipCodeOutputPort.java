package br.com.devsenior.hexagonal.application.ports.out;

import br.com.devsenior.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    
    Address find(String zipCode);
}
