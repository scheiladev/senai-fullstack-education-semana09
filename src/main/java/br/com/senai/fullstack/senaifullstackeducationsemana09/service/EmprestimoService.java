package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.EmprestimoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

  public final EmprestimoRepository emprestimoRepository;

  public List<EmprestimoEntity> listar() {
    return emprestimoRepository.findAll();
  }
}
