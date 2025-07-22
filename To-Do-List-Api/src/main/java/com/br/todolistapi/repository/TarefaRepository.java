
package com.br.todolistapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.todolistapi.model.TarefaModel;

public interface TarefaRepository extends MongoRepository<TarefaModel, String> {  }