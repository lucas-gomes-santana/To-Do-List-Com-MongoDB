package com.br.todolistapi.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "tarefas")
public class TarefaModel {

    @Id
    private String id;
    
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataTermino;
}
