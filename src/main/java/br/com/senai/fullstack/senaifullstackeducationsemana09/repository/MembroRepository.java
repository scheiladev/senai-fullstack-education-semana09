
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

  @Transactional
  @Modifying
  @Query("update MembroEntity m set " +
      "m.nome = :nome, " +
      "m.endereco = :endereco, " +
      "m.telefone = :telefone " +
      "where m.id = :id")
  void update(@Param("id") Long id,
              @Param("nome") String nome,
              @Param("endereco") String endereco,
              @Param("telefone") String telefone);
}
