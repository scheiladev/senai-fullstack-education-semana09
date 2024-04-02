package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "emprestimo")
public class EmprestimoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDate dataEmprestimo;
  private LocalDate dataDevolucao;

  @ManyToOne
  @JoinColumn(name = "livro_id")
  private LivroEntity livro;
  @ManyToOne
  @JoinColumn(name = "membro_id")
  private MembroEntity membro;
}
