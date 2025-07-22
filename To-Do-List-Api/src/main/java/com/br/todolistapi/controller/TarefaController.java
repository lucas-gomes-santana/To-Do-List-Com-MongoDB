package com.br.todolistapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.todolistapi.model.TarefaModel;
import com.br.todolistapi.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/tarefas")
public class TarefaController {
    
    private final TarefaRepository repository;

    @GetMapping
    public List<TarefaModel> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public TarefaModel getById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/criar")
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa) {
        tarefa.setDataCriacao(java.time.LocalDateTime.now());
        return repository.save(tarefa);
    }

    @PutMapping("/{id}")
    public TarefaModel atualizar(@PathVariable String id, @RequestBody TarefaModel tarefa) {
        tarefa.setId(id);
        return repository.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public void removerTarefa(@PathVariable String id) {
        repository.deleteById(id);
    }
    
}
