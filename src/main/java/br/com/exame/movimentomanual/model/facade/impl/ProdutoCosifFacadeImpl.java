package br.com.exame.movimentomanual.model.facade.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.ProdutoCosifDTO;
import br.com.exame.movimentomanual.model.facade.ProdutoCosifFacade;
import br.com.exame.movimentomanual.model.mapper.ProdutoCosifMapper;
import br.com.exame.movimentomanual.model.repository.ProdutoCosifRepository;

@Component
public class ProdutoCosifFacadeImpl implements ProdutoCosifFacade {
	
	@Autowired
	private ProdutoCosifRepository repository;
	
	@Autowired
	private ProdutoCosifMapper mapper;	

	@Override
	public List<ProdutoCosifDTO> findByProdutoId(Integer produtoId) {
		return  repository.findByIdProdutoProdutoId(produtoId)
				.stream()
				.map(mapper::fromModel)
				.collect(Collectors.toList());	
	}

}
