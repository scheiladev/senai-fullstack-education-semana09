
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

  @Modifying
  @Transactional
  @Query("update BibliotecarioEntity b set " +
      "b.nome = :nome, " +
      "b.email = :email, " +
      "b.senha = :senha " +
      "where b.id = :id")
  void update(@Param("id") Long id,
              @Param("nome") String nome,
              @Param("email") String email,
              @Param("senha") String senha);
}
