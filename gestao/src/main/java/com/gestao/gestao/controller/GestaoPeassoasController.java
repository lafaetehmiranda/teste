package com.gestao.gestao.controller;


import com.gestao.gestao.dto.PessoaDTO;
import com.gestao.gestao.entity.Pessoa;
import com.gestao.gestao.service.PessoaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestao")
public class GestaoPeassoasController {

    private PessoaService pessoaService;

    @Autowired
    public GestaoPeassoasController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    @PostMapping(value = "pessoas", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<Pessoa> savePessoas(@RequestBody @Validated PessoaDTO pessoa) {

        return new ResponseEntity<Pessoa>(pessoaService.save(pessoa), HttpStatus.CREATED);

    }

    @DeleteMapping(value = "/pessoas/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Response deleteById(@PathVariable(value = "id") Long id) {
        return pessoaService.deleteById(id);
    }



}
