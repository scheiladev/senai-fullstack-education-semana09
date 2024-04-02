package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("bibliotecarios")
public class BibliotecarioController {

  private final BibliotecarioService bibliotecarioService;

  public BibliotecarioController(BibliotecarioService bibliotecarioService) {
    this.bibliotecarioService = bibliotecarioService;
  }

  @GetMapping
  public List<BibliotecarioEntity> listarTodos() {
    return bibliotecarioService.listarTodos();
  }

  @GetMapping("{id}")
  public BibliotecarioEntity buscarPorId(@PathVariable Long id) throws Exception {
    return bibliotecarioService.buscarPorId(id);
  }

  @PostMapping
  public BibliotecarioEntity salvar(@RequestBody BibliotecarioEntity bibliotecario) throws Exception {
    return bibliotecarioService.salvar(bibliotecario);
  }

  @PutMapping("{id}")
  public void atualizar(@PathVariable Long id, @RequestBody BibliotecarioEntity bibliotecario) throws Exception {
    bibliotecarioService.atualizar(id, bibliotecario);
  }

  @DeleteMapping("{id}")
  public void deletar(@PathVariable Long id) throws Exception {
    bibliotecarioService.deletar(id);
  }
}
