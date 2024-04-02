package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
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

  public MembroEntity atualizar(Long id, MembroEntity membro) throws Exception {
    MembroEntity entity = buscarPorId(id);
    entity.setNome(membro.getNome());
    entity.setEndereco(membro.getEndereco());
    entity.setTelefone(membro.getTelefone());
    return membroRepository.save(entity);
  }

  public void deletar(Long id) throws Exception {
    MembroEntity membro = buscarPorId(id);
    membroRepository.delete(membro);
  }
}
