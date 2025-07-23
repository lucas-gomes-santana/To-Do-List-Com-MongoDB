#### Projeto To-Do List Java + MongoDB

Este é um projeto pessoal meu de caráter puramente acadêmico para aprender sobre os fundamentos e como funciona um banco de dados não relacional(NoSQL). Consite no clássico mini-projeto de lista de tarefas. Enviadas por requisições REST e armazenadas em um banco de dados MongoDB.

****

### Stacks utilizadas

- Java(Versão 17) + Spring Boot + Maven

- MongoDB

****

### Como utilizar o projeto


OBS: Necessário que tenha o Java, Maven e o MongoDB instalados na sua máquina, além de Postman ou Insomnia para enviar requisições para a API.

<br>

**Requisição POST, URL: http://localhost:8080/tarefas/criar**
```json
{
  "titulo": "Estudar MongoDB",
  "descricao": "Assistir cursos para aprender sobre o MongoDB ",
  "status": "Pendente",
  "prioridade": "Alta",
  "dataTermino": "30/07/2025 20:00"
}
```

<br>

**Requisição GET, URL: http://localhost:8080/tarefas/listartodas**

<br>

**Requisição DELETE, URL: http://localhost:8080/tarefas/remover/id_da_tarefa**

<br>

**Requisição PUT, URL: http://localhost:8080/tarefas/atualizar/id_da_tarefa**
```json
{
  "titulo": "Estudar MongoDB",
  "descricao": "Asistir vídeos no Youtube para aprender sobre bancos de dados não relacionais, como o MongoDB",
  "status": "Concluída",
  "prioridade": "",
  "dataTermino": "30/07/2025 20:00"
}
```