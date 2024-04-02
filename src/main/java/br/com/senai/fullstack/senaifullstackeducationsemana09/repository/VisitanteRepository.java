
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

  @Modifying
  @Transactional
  @Query("update VisitanteEntity v set " +
      "v.nome = :nome, " +
      "v.telefone = :telefone " +
      "where v.id = :id")
  void update(@Param("id") Long id,
              @Param("nome") String nome,
              @Param("telefone") String telefone);

}
