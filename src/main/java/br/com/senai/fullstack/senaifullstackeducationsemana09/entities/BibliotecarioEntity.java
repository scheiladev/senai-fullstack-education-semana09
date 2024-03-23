package br.com.senai.fullstack.senaifullstackeducationsemana09.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="bibliotecario")
@Entity
@Data
public class BibliotecarioEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private String senha;

}
