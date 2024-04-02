
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

//  @Query(name = "Update BibliotecarioRepository set bibliotecario"  +
//      " bibliotecario.nome = :nome, " +
//      " bibliotecario.email = :email," +
//      " bibliotecario.senha = :senha" +
//      " where bibliotecario.id = :id")
//  BibliotecarioEntity update(@Param("nome") String nome,
//                      @Param("email") String email,
//                      @Param("senha") String senha,
//                             @Param("id") Long id);
}
