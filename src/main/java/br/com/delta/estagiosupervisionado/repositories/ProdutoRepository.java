package br.com.delta.estagiosupervisionado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.delta.estagiosupervisionado.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
