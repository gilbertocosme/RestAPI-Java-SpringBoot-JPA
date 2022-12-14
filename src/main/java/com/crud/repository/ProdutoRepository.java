package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
