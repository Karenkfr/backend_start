package com.capgemini.start.util;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.start.domain.entity.Genero;
import com.capgemini.start.domain.entity.Tipo;
import com.capgemini.start.domain.repository.GeneroRepository;
import com.capgemini.start.domain.repository.TipoRepository;

@Component
public class LoadData {

	@Autowired
	private TipoRepository tipoRepository;

	private void carregarTipos() {
		var filmes = new Tipo(null, "Filmes", new Date(), null);
		var series = new Tipo(null, "Series", new Date(), null);
		tipoRepository.saveAll(List.of(filmes, series));
	}
	@Autowired
	private GeneroRepository generoRepository;

	private void carregaGeneros() {
		var filmes = new Genero(null, "Filmes", new Date(), null);
		var series = new Genero(null, "Series", new Date(), null);
		generoRepository.saveAll(List.of(filmes, series));
	}

	@PostConstruct
	public void carregar() {
		carregarTipos();
		// carregaGeneros();
	}

}
