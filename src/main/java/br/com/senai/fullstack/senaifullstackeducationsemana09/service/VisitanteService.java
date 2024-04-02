package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {

  public final VisitanteRepository visitanteRepository;

  public List<VisitanteEntity> listarTodos() {
    return visitanteRepository.findAll();
  }

  public VisitanteEntity buscarPorId(Long id) throws Exception {
    return visitanteRepository.findById(id).orElseThrow(() -> new Exception("Visitante não encontrado!"));
  }

  public VisitanteEntity salvar(VisitanteEntity visitante) throws Exception {
    visitante.setId(null);
    return visitanteRepository.save(visitante);
  }

  public VisitanteEntity atualizar(VisitanteEntity visitante) {
    return visitanteRepository.update(
        visitante.getNome(),
        visitante.getTelefone(),
        visitante.getId()
    );
  }

  public void deletar(Long id) throws Exception {
    VisitanteEntity visitante = buscarPorId(id);
    visitanteRepository.delete(visitante);
  }
}
