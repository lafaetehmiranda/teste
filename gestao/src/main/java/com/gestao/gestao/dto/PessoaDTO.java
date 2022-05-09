package com.gestao.gestao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.NonNull;


@Data
@AllArgsConstructor

public class PessoaDTO {

    @NonNull
    String name;
    @NonNull
    Long departamento;

}
