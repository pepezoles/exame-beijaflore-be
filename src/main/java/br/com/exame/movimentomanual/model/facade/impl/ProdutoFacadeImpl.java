package br.com.exame.movimentomanual.model.facade.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.ProdutoDTO;
import br.com.exame.movimentomanual.model.facade.ProdutoFacade;
import br.com.exame.movimentomanual.model.mapper.ProdutoMapper;
import br.com.exame.movimentomanual.model.repository.ProdutoRepository;

@Component
public class ProdutoFacadeImpl implements ProdutoFacade {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private ProdutoMapper mapper;	

	@Override
	public List<ProdutoDTO> findAll() {	
		return repository.findAll()
				.stream()
				.map(mapper::fromModel)
				.collect(Collectors.toList());		
	}

}
