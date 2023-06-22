package br.com.projeto.screenmatch.domain.filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
/* Essa interface ira permitir os metodos CRUD */