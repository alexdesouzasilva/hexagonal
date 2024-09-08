package br.com.devsenior.hexagonal.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.devsenior.hexagonal.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, Long> {
    
}
