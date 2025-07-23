// Exemplo de classe Java de Model quando usa-se MongoDB como banco de dados.
package com.br.todolistapi.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// Define o nome da Collection a ser usada no banco. E se não existir é criada automaticamente
@Document(collection = "tarefas") 
public class TarefaModel {

    @Id
    private String id;
    
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;

    // Ajustando formato da data de criação e término da tarefa para ficar no formato brasileiro
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalDateTime dataCriacao;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", shape = JsonFormat.Shape.STRING)
    private LocalDateTime dataTermino;
}
