# Cadastro de Clientes (Java)

Projeto de estudo em Java com foco em arquitetura em camadas e boas práticas de CRUD.

---

## 🚀 Funcionalidades

- Criar cliente com validação de dados
- Listar todos os clientes
- Buscar cliente por ID
- Atualizar dados do cliente
- Deletar cliente
- Validação de nome, email e telefone
- Exceção personalizada para cliente não encontrado

---

## 🧱 Estrutura do projeto

- **model/** → Entidades do sistema (Cliente)
- **repository/** → Simulação de persistência de dados
- **service/** → Regras de negócio
- **ui/** → Interface de console (ClienteConsole)
- **validation/** → Validações centralizadas
- **exception/** → Exceções personalizadas

---

## 🧠 Conceitos aplicados

- Arquitetura em camadas
- Separação de responsabilidades (SRP)
- Encapsulamento de regras de negócio
- Validações reutilizáveis
- Exceções customizadas
- Princípios básicos de Clean Code

---

## 🛠️ Tecnologias

- Java 21
- Maven
- JUnit 5
- Estrutura em memória (ArrayList)
- Eclipse IDE

---

## 🎯 Objetivo do projeto

Evoluir gradualmente um CRUD simples para uma API REST com Spring Boot, aplicando boas práticas de engenharia de software.

---

## 📌 Próximos passos

- [ ] Escrever testes unitários com JUnit 5
- [ ] Migrar persistência para JDBC + MySQL
- [ ] Migrar para Spring Boot e criar API REST
- [ ] Integrar com Spring Data JPA

## ▶️ Como rodar

**Pré-requisitos:** Java 21 e Maven instalados

```bash
# Clonar o repositório
git clone https://github.com/matt-almeida/cadastro-clientes.git

# Compilar
mvn compile

# Rodar os testes
mvn test
```
