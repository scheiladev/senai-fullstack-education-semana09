package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/membros")
public class MembroController {

  private final MembroService membroService;

  @GetMapping
  public List<MembroEntity> listarTodos() {
    return membroService.listar();
  }
}
