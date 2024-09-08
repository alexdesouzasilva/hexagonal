package br.com.devsenior.hexagonal.adapters.in.controller.response;

import br.com.devsenior.hexagonal.adapters.out.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {
    
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
