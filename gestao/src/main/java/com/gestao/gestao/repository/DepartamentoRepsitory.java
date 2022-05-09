package com.gestao.gestao.repository;



import com.gestao.gestao.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepsitory extends JpaRepository<Departamento, Long> {
}
