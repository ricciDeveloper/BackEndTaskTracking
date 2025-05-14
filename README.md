# TaskTracking Backend

API REST para sistema de gerenciamento de tarefas com painel administrador, desenvolvido em Java com Spring Boot.

---

## Descrição

Este projeto implementa uma API backend para um sistema de Task Tracking onde:

- Usuários podem cadastrar, atualizar, listar e excluir suas tarefas.
- Administradores podem gerenciar até 5 colaboradores, visualizar e controlar as tarefas desses colaboradores.
- Autenticação via login/senha com Spring Security e controle de acesso por roles (`ADMIN`, `USER`).
- Persistência dos dados com JPA/Hibernate em banco relacional (MySQL, H2, etc).

---

## Funcionalidades

- Cadastro e autenticação de usuários (admins e colaboradores)
- Criação, edição, listagem e exclusão de tarefas
- Painel administrador para gerenciamento de colaboradores e visualização das tarefas deles
- Controle de acesso baseado em roles
- Restrição de até 5 colaboradores por administrador

---

## Tecnologias

- Java 17+
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA / Hibernate
- Banco de dados relacional (MySQL, H2 para testes)
- Maven

---