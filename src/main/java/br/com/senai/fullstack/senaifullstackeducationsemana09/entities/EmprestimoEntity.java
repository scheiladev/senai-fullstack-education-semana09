package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name="emprestimo")
@Entity
@Data
public class EmprestimoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
    private LivroEntity livro;
  @ManyToOne
  private MembroEntity membro;
  private LocalDate dataEmprestimo;
  private LocalDate dataDevolucao;

}
