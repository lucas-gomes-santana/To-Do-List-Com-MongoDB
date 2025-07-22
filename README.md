#### Projeto To-Do List Java + MongoDB

Este é um projeto pessoal meu de caráter puramente acadêmico para aprender sobre os fundamentos e como funciona um banco de dados não relacional(NoSQL). Consite em um clássico mini-projeto de lista de tarefas

****

### Stacks utilizadas

- Java(Versão 17) + Spring Boot + Maven

- MongoDB

****

### Como utilizar o projeto


OBS: Necessário que tenha o Java, Maven e o MongoDB instalados na sua máquina, além de Postman ou Insomnia para enviar requisições para a API Java.

<br>

**Requisição POST, URL: http://localhost:8080/tarefas/criar**
```json
{
  "titulo": "Estudar MongoDB",
  "descricao": "Assistir cursos para aprender sobre o MongoDB ",
  "status": "Pendente",
  "prioridade": "Alta",
  "dataTermino": "2025-07-25T20:00:00"
}

```

**Requisição GET, URL: http://localhost:8080/tarefas**


**Requisição DELETE, URL: http://localhost:8080/tarefas/id_da_tarefa**
