package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="membro")
public class MembroEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String nome;
  private String endereco;
  private String telefone;

  public MembroEntity(Long id) {
    this.id = id;
  }
}