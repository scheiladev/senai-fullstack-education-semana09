package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visitantes")
public class VisitanteController {

  private final VisitanteService visitanteService;

  @GetMapping
  public List<VisitanteEntity> listarTodos() {
    return visitanteService.listar();
  }
}
