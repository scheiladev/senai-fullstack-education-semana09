
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

//  @Query(name = "Update LivroRepository set livro" +
//      " livro.titulo = :titulo, " +
//      " livro.autor = :autor," +
//      " livro.anoPublicacao = :ano_publicacao" +
//      " where livro.id = :id")
//  LivroEntity update(@Param("titulo") String titulo,
//                     @Param("autor") String autor,
//                     @Param("ano_publicacao") Long anoPublicacao,
//                     @Param("id") Long id);
}
