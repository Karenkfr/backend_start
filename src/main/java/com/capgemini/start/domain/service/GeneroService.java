package com.capgemini.start.domain.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.Genero;
import com.capgemini.start.domain.repository.GeneroRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class GeneroService extends AbstractService<Genero, Long> {

	private final GeneroRepository repository;
	@Override
	protected JpaRepository<Genero, Long> getRepository() {
		
		return this.repository;
	}
	
	
}


