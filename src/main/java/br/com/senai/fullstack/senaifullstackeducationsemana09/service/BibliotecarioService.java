package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

  public final BibliotecarioRepository bibliotecarioRepository;

  public List<BibliotecarioEntity> listarTodos() {
    return bibliotecarioRepository.findAll();
  }

  public BibliotecarioEntity buscarPorId(Long id) throws Exception {
    return bibliotecarioRepository.findById(id).orElseThrow(() -> new Exception("Bibliotecário não encontrado!"));
  }
  public BibliotecarioEntity salvar(BibliotecarioEntity bibliotecario) throws Exception {
    bibliotecario.setId(null);
    return bibliotecarioRepository.save(bibliotecario);
  }

  public void atualizar(Long id, BibliotecarioEntity bibliotecario) throws Exception {
    bibliotecarioRepository.update(id, bibliotecario.getNome(), bibliotecario.getEmail(), bibliotecario.getSenha());
  }

  public void deletar(Long id) throws Exception {
    BibliotecarioEntity bibliotecario = buscarPorId(id);
    bibliotecarioRepository.delete(bibliotecario);
  }

}
