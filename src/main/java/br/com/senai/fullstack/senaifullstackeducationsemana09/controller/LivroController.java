package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

  private final LivroService livroService;

  public LivroController(LivroService livroService) {
    this.livroService = livroService;
  }

  @GetMapping
  public List<LivroEntity> listarTodos() {
    return livroService.listarTodos();
  }

  @GetMapping("{id}")
  public LivroEntity buscarPorId(@PathVariable Long id) throws Exception {
    return livroService.buscarPorId(id);
  }

  @PostMapping
  public LivroEntity salvar(@RequestBody LivroEntity livro) throws Exception {
    return livroService.salvar(livro);
  }

  @PutMapping("{id}")
  public void atualizar(@PathVariable Long id, @RequestBody LivroEntity livro) throws Exception {
    livroService.atualizar(id, livro);
  }

  @DeleteMapping("{id}")
  public void deletar(@PathVariable Long id) throws Exception {
    livroService.deletar(id);
  }
}