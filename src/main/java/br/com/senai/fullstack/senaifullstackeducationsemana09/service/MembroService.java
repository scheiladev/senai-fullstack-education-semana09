package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {

  public final MembroRepository membroRepository;

  public List<MembroEntity> listarTodos() {
    return membroRepository.findAll();
  }

  public MembroEntity buscarPorId(Long id) throws Exception {
    return membroRepository.findById(id).orElseThrow(() -> new Exception("Membro não encontrado!"));
  }

  public MembroEntity salvar(MembroEntity membro) throws Exception {
    membro.setId(null);
    return membroRepository.save(membro);
  }

  public void atualizar(Long id, MembroEntity membro) throws Exception {
    membroRepository.update(id, membro.getNome(), membro.getEndereco(), membro.getTelefone());
  }

  public void deletar(Long id) throws Exception {
    MembroEntity membro = buscarPorId(id);
    membroRepository.delete(membro);
  }
}
