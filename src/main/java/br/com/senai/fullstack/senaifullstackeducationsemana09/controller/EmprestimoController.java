package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.EmprestimoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {

  private final EmprestimoService emprestimoService;

  public EmprestimoController(EmprestimoService emprestimoService) {
    this.emprestimoService = emprestimoService;
  }

  @GetMapping
  public List<EmprestimoEntity> listarTodos() {
    return emprestimoService.listarTodos();
  }

  @GetMapping("{id}")
  public EmprestimoEntity buscarPorId(@PathVariable Long id) throws Exception {
    return emprestimoService.buscarPorId(id);
  }

  @PostMapping
  public EmprestimoEntity salvar(@RequestBody EmprestimoEntity emprestimo) throws Exception {
    return emprestimoService.salvar(emprestimo);
  }

  @PutMapping("{id}")
  public void atualizar(@PathVariable Long id, @RequestBody EmprestimoEntity emprestimo) throws Exception {
    emprestimoService.atualizar(id, emprestimo);
  }

  @DeleteMapping("{id}")
  public void deletar(@PathVariable Long id) throws Exception {
    emprestimoService.deletar(id);
  }
}