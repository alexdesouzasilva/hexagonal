package br.com.devsenior.hexagonal.adapters.out.repository.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private Long id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean isValidCpf;

    
}
