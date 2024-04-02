package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="visitante")
public class VisitanteEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String telefone;

  public VisitanteEntity(Long id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
  }

  public VisitanteEntity(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public VisitanteEntity() {

  }
}
