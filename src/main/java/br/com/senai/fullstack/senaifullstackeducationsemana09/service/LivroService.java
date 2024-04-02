package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.VisitanteEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

  public final LivroRepository livroRepository;

  public List<LivroEntity> listarTodos() {
    return livroRepository.findAll();
  }

  public LivroEntity buscarPorId(Long id) throws Exception {
    return livroRepository.findById(id).orElseThrow(() -> new Exception("Livro não encontrado!"));
  }

  public LivroEntity salvar(LivroEntity livro) throws Exception {
    livro.setId(null);
    return livroRepository.save(livro);
  }

  public void atualizar(Long id, LivroEntity livro) throws Exception {
    livroRepository.update(id, livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
  }

  public void deletar(Long id) throws Exception {
    LivroEntity livro = buscarPorId(id);
    livroRepository.delete(livro);
  }
}


