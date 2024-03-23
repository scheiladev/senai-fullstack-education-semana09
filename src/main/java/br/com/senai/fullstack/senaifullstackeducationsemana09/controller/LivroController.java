package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/livros")
public class LivroController {

  private final LivroService livroService;

  @GetMapping
  public List<LivroEntity> listarTodos() {
    return livroService.listar();
  }

}