package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.EmprestimoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimos")
public class EmprestimoController {

  private final EmprestimoService emprestimoService;

  @GetMapping
  public List<EmprestimoEntity> listarTodos() {
    return emprestimoService.listar();
  }

}