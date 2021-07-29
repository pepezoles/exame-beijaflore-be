package br.com.exame.movimentomanual.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.ProdutoDTO;
import br.com.exame.movimentomanual.model.facade.ProdutoFacade;

@Component
public class FindProduto {
	
	@Autowired
	private ProdutoFacade facade;
	
	public List<ProdutoDTO> findAll() {
		return facade.findAll();
	}	

}
