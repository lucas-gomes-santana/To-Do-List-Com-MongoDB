
package com.br.todolistapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.todolistapi.model.TarefaModel;

// Usa-se MongoRepository aqui pois é um banco de dados não relacional
public interface TarefaRepository extends MongoRepository<TarefaModel, String> {  }