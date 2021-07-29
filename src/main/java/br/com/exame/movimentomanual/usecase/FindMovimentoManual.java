package br.com.exame.movimentomanual.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;
import br.com.exame.movimentomanual.model.facade.MovimentoManualFacade;

@Component
public class FindMovimentoManual {
	
	@Autowired
	private MovimentoManualFacade facade;
	
	public List<MovimentoManualDTO> findAll() {
		return facade.findAll();
	}	

}
