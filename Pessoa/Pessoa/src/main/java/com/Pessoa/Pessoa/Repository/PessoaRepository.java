package com.Pessoa.Pessoa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pessoa.Pessoa.Model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Pessoa findByCodigo(long codigo);
}
