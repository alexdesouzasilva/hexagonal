package br.com.devsenior.hexagonal.application.core.domain;

public class Customer {
    
    // Não pode ter contato com o mundo externo, nem mesmo frameworks
    // Por tanto, não podemos usar lombok, por exemplo.

    private Long id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;

    
    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(Long id, String name, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Boolean getIsValidCpf() {
        return isValidCpf;
    }
    public void setIsValidCpf(Boolean isValidCpf) {
        this.isValidCpf = isValidCpf;
    }

    

}
