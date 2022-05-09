package com.gestao.gestao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String título;
    private String descrição;
    private String prazo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departamento_id", referencedColumnName = "id")
    private Long departamento_id;
    private String duração;

    @ManyToOne
    @JoinColumn(name="pessoa_id", nullable=false)
    private Pessoa pessoa;

}
