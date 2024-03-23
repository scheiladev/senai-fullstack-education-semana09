package br.com.senai.fullstack.senaifullstackeducationsemana09.service;

import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.BibliotecarioEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.entities.LivroEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana09.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

  public final LivroRepository livroRepository;

  public List<LivroEntity> listar() {
    return livroRepository.findAll();
  }}
