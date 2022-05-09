package com.gestao.gestao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestePessoa {


    @Test
    public void pessoaCadastrando(){

        String pessoa = "jose";
        Integer departamento = 5;

        var departamento1 = new Integer(1);
        var pessoa2 = new String("camila");



        assertEquals(departamento1, pessoa2);

    }




}
