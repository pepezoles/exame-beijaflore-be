package br.com.exame.movimentomanual.model.facade;

import java.util.List;

import br.com.exame.movimentomanual.model.ProdutoCosifDTO;

public interface ProdutoCosifFacade {	

	public List<ProdutoCosifDTO> findByProdutoId(Integer produtoId);

}
