package com.gestao.gestao.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@Builder
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departamento_id", referencedColumnName = "id")
    private Departamento departamento_id;

    @OneToMany(mappedBy="pessoa")
    List<Tarefa> tarefas;




}
