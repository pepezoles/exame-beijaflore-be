package br.com.exame.movimentomanual.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.ProdutoCosifDTO;
import br.com.exame.movimentomanual.model.facade.ProdutoCosifFacade;

@Component
public class FindProdutoCosif {
	
	@Autowired
	private ProdutoCosifFacade facade;
	
	public List<ProdutoCosifDTO> findByProdutoId(Integer produtoId) {
		return facade.findByProdutoId(produtoId);
	}	

}
