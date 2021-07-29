package br.com.exame.movimentomanual.model.facade;

import java.util.List;

import br.com.exame.movimentomanual.model.ProdutoDTO;

public interface ProdutoFacade {
	
	public List<ProdutoDTO> findAll();

}
