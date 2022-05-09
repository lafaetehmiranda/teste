package com.gestao.gestao.service;


import com.gestao.gestao.dto.PessoaDTO;
import com.gestao.gestao.entity.Departamento;
import com.gestao.gestao.entity.Pessoa;
import com.gestao.gestao.repository.PessoaRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public static final String NAO_PODE_SER_VAZIO_OU_NULO = "name não pode ser null ou vazio";

    private boolean emptyOrBlankStringValidation(PessoaDTO pessoa) {
        return pessoa.getName() == null ||
                pessoa.getName().isBlank() ||
                pessoa.getName().isEmpty();
    }

    public Pessoa save(PessoaDTO pessoaDTO) {

        var departamento = Departamento.builder().id(pessoaDTO.getDepartamento()).build();
        var pessoa = Pessoa.builder().name(pessoaDTO.getName()).departamento_id(departamento).build();

        return  pessoaRepository.save(pessoa);
    }

    public Response deleteById(Long id) {
        return deleteById(id);
    }


}
