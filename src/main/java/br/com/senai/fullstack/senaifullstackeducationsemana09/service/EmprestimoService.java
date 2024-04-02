package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.EmprestimoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

  public final EmprestimoRepository emprestimoRepository;

  public List<EmprestimoEntity> listarTodos() {
    return emprestimoRepository.findAll();
  }

  public EmprestimoEntity buscarPorId(Long id) throws Exception {
    return emprestimoRepository.findById(id).orElseThrow(() -> new Exception("Empréstimo não encontrado!"));
  }

  public EmprestimoEntity salvar(EmprestimoEntity emprestimo) throws Exception {
    emprestimo.setId(null);
    return emprestimoRepository.save(emprestimo);
  }

  public EmprestimoEntity atualizar(Long id, EmprestimoEntity emprestimo) throws Exception {
    EmprestimoEntity entity = buscarPorId(id);
    entity.setLivro(emprestimo.getLivro());
    entity.setMembro(emprestimo.getMembro());
    entity.setDataEmprestimo(emprestimo.getDataEmprestimo());
    entity.setDataDevolucao(emprestimo.getDataDevolucao());
    return emprestimoRepository.save(entity);
  }

  public void deletar(Long id) throws Exception {
    EmprestimoEntity emprestimo = buscarPorId(id);
    emprestimoRepository.delete(emprestimo);
  }
}
