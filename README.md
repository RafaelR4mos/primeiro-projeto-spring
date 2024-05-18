## Spring Boot
Primeira aplicação Spring Boot

## Criação de Projeto

0. Requisitos projeto `Spring boot`
       
    0.1. Ter Java 17 JDK >= 17
    
    0.2. Possuir o Maven instalado para gerenciar dependencias
    
    0.3. InteliJ ou VSCode + Extensões para codar

1. Criar projeto com [spring initializr](https://start.spring.io/).
     
    1.1. Selecionar suas preferêcias (versão, gerenciador de pacote e etc.)
     
    1.2. Para projeto WEB OBRIGATÓRIO adicionar dependencia `Spring WEB`.
    
    1.3. Quando tudo estiver pronto clicar em "Generate" para receber o .zip com o projeto
    
    1.4. Abrir a pasta já extraida na sua IDE de escolha.

2. Iniciar projeto
   
O projeto é iniciado com o `Tomcat` em `localhost:8080`.

```bash
  mvn spring-boot:run
```

3. Acesse `http:localhost:8080` em seu navegador ou HTTP Client (Postman, Insomnia...)
