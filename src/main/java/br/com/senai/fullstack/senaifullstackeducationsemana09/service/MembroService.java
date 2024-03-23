package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.MembroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {

  public final MembroRepository membroRepository;

  public List<MembroEntity> listar() {
    return membroRepository.findAll();
  }
}
