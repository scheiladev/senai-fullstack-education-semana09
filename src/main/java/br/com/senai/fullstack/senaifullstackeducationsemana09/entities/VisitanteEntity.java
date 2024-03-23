package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="visitante")
@Entity
@Data
public class VisitanteEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String telefone;

}
