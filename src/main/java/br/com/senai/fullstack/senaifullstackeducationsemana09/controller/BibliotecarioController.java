package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

  private final BibliotecarioService bibliotecarioService;

  @GetMapping
  public List<BibliotecarioEntity> listarTodos() {
    return bibliotecarioService.listar();
  }

}
