package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitantes")
public class VisitanteController {

  private final VisitanteService visitanteService;

  public VisitanteController(VisitanteService visitanteService) {
    this.visitanteService = visitanteService;
  }

  @GetMapping
  public List<VisitanteEntity> listarTodos() {
    return visitanteService.listarTodos();
  }

  @GetMapping("{id}")
  public VisitanteEntity buscarPorId(@PathVariable Long id) throws Exception {
    return visitanteService.buscarPorId(id);
  }

  @PostMapping
  public VisitanteEntity salvar(@RequestBody VisitanteEntity visitante) throws Exception {
    return visitanteService.salvar(visitante);
  }

  @PutMapping("{id}")
  public void atualizar(@PathVariable Long id, @RequestBody VisitanteEntity visitante) throws Exception {
    visitanteService.atualizar(id, visitante);
  }

  @DeleteMapping("{id}")
  public void deletar(@PathVariable Long id) throws Exception {
    visitanteService.deletar(id);
  }
}
