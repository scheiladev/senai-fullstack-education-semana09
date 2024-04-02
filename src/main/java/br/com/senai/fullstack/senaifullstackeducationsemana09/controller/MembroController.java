package br.com.senai.fullstack.senaifullstackeducationsemana09.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class MembroController {

  private final MembroService membroService;

  public MembroController(MembroService membroService) {
    this.membroService = membroService;
  }

  @GetMapping
  public List<MembroEntity> listarTodos() {
    return membroService.listarTodos();
  }

  @GetMapping("{id}")
  public MembroEntity buscarPorId(@PathVariable Long id) throws Exception {
    return membroService.buscarPorId(id);
  }

  @PostMapping
  public MembroEntity salvar(@RequestBody MembroEntity membro) throws Exception {
    return membroService.salvar(membro);
  }

  @PutMapping("{id}")
  public void atualizar(@PathVariable Long id, @RequestBody MembroEntity membro) throws Exception {
    membroService.atualizar(id, membro);
  }

  @DeleteMapping("{id}")
  public void deletar(@PathVariable Long id) throws Exception {
    membroService.deletar(id);
  }
}
