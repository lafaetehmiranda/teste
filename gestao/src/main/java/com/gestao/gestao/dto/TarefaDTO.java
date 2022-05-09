package com.gestao.gestao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TarefaDTO {

    String  titulo;
    String  descricao;
    String  prazo;
    Long  departamento;
    String  duracao;

}
