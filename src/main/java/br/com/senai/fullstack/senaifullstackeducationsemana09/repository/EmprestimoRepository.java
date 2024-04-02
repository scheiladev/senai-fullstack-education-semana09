
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.EmprestimoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

//  @Modifying
  @Transactional
  @Modifying
  @Query("update EmprestimoEntity e set " +
      "e.livro = :livro, " +
      "e.membro = :membro, " +
      "e.dataEmprestimo = :data_emprestimo, " +
      "e.dataDevolucao = :data_devolucao " +
      "where e.id = :id")
  void update(@Param("id") Long id,
              @Param("livro") LivroEntity livro,
              @Param("membro") MembroEntity membro,
              @Param("data_emprestimo") LocalDate data_publicacao,
              @Param("data_devolucao") LocalDate data_devolucao);
}
