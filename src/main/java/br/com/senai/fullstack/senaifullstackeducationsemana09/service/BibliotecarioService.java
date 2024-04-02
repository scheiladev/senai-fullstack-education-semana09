package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

  public final BibliotecarioRepository bibliotecarioRrepository;

  public List<BibliotecarioEntity> listarTodos() {
    return bibliotecarioRrepository.findAll();
  }

  public BibliotecarioEntity buscarPorId(Long id) throws Exception {
    return bibliotecarioRrepository.findById(id).orElseThrow(() -> new Exception("Bibliotecário não encontrado!"));
  }
  public BibliotecarioEntity salvar(BibliotecarioEntity bibliotecario) throws Exception {
    bibliotecario.setId(null);
    return bibliotecarioRrepository.save(bibliotecario);
  }

  public BibliotecarioEntity atualizar(Long id, BibliotecarioEntity bibliotecario) throws Exception {
    BibliotecarioEntity entity = buscarPorId(id);
    entity.setNome(bibliotecario.getNome());
    entity.setEmail(bibliotecario.getEmail());
    entity.setSenha(bibliotecario.getSenha());
    return bibliotecarioRrepository.save(entity);
  }

  public void deletar(Long id) throws Exception {
    BibliotecarioEntity bibliotecario = buscarPorId(id);
    bibliotecarioRrepository.delete(bibliotecario);
  }

}
