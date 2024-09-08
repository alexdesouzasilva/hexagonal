package br.com.devsenior.hexagonal.adapters.out.client.response;

import lombok.Data;

// Como estamos na camada adapters, já podemos usar frameworks
@Data
public class AddressResponse {
    
    private String street;
    private String city;
    private String state;

}
