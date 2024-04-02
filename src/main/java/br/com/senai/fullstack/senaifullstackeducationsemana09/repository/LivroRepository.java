
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

  @Modifying
  @Transactional
  @Query("update LivroEntity l set " +
      "l.titulo = :titulo, " +
      "l.autor = :autor, " +
      "l.anoPublicacao = :ano_publicacao " +
      "where l.id = :id")
  void update(@Param("id") Long id,
              @Param("titulo") String titulo,
              @Param("autor") String autor,
              @Param("ano_publicacao") Long ano_publicacao);
}
