package br.com.exame.movimentomanual.model.facade;

import java.util.List;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;

public interface MovimentoManualFacade {
	
	public List<MovimentoManualDTO> findAll();
	
	public Integer findMaxLancamentoByMesAno(MovimentoManualDTO dto);
	
	public void incluir(MovimentoManualDTO dto);

}
