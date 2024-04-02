
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

//  @Query(name = "Update MembroRepository set membro" +
//      " membro.nome = :nome, " +
//      " membro.endereco = :endereco," +
//      " membro.telefone = :telefone" +
//      " where membro.id = :id")
//  MembroEntity update(@Param("nome") String nome,
//                      @Param("endereco") String endereco,
//                      @Param("telefone") String telefone,
//                      @Param("id") Long id);
}
