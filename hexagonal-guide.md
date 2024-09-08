# Arquitetura Hexagonal

* Ports -> São as interfaces

## Estrutura completa:
```
src/main/java/br/com/devsenior/hexagonal
├── adapters
│   ├── in
│   │   ├── consumer
│   │   └── controller
│   └── out
│       ├── client
│       └── repository
├── application
│   ├── core
│   │   ├── domain
│   │   └── usecase
│   └── ports
│       ├── in
│       └── out
├── config
└── HexagonalApplication.java

```

### Adaptadores de entrada:
* consumer (consumidor de filas)
* controller (API)

### Adaptadores de saída:
* client: para acessar outro microsserviço
* repository: para acessar a base de dados

## Application:
### CORE
* Onde fica todo core da aplicação.
* domain: classes de domínio.
* usecase: regras de negócio.
### PORTS
* in: como acessar o core da aplicação.
* out: como sair do core da aplicação.

## Config:
* Onde ficará toda parte de configuração do projeto.