# ms-worker
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RafaelCoutoP/ms-worker/blob/main/LICENSE)

# Sobre o projeto

Uma aplicação com arquitetura de microservices desenvolvida com os ensinamentos do professor Nélio Alves. O microservice(payroll) fornece um serviço de folha de pagamento, no qual gera o valor do pagamento do funcionário baseado nos dias trabalhados e quanto vale o dia do trabalho do mesmo. A aplicação tem também um microservice de buscas de trabalhadores, com base no nivel de autoridade do usuário administrador logado, tendo dois niveis, sendo eles OPERADOR e ADMIN. O ADMIN além de possuir o poder de pesquisar os trabalhadores por ID e busca geral, tem também a possibilidade de buscar os usuarios OPERADORES e ADMIN.

## Autorização do sistema

O usuário administrador obrigatoriamente tem que estar logado para acessar os dados de buscas e de pagamento dos microservices da aplicação.
O sistema de Autorização foi feito com o algoritmo de criptação BCrypt e token JWT com a api  de autorização e autenticação OAuth2 seguindo os padrões de arquitetura do oauth2.

#Modelo microservices

![modelo microservice](https://github.com/RafaelCoutoP/ms-worker/blob/main/assets/Captura%20de%20Tela%20(52).png)


#Modelo conceitual

![modelo conceitual](https://github.com/RafaelCoutoP/ms-worker/blob/main/assets/Captura%20de%20Tela%20(51).png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Spring Security
- Banco H2
- OAuth2
- Token JWT
- BCrypt
- Eureka Server
- Zuul
- Config Server

# Implementação em produção
- Docker 
- Banco de dados Postgres

# Autor
Rafael Couto
