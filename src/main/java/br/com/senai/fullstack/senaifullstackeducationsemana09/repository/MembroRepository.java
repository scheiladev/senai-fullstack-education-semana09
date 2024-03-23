
package br.com.senai.fullstack.senaifullstackeducationsemana09.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

}
