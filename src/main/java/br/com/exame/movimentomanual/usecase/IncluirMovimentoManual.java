package br.com.exame.movimentomanual.usecase;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;
import br.com.exame.movimentomanual.model.facade.MovimentoManualFacade;

@Component
public class IncluirMovimentoManual {
	
	@Autowired
	private MovimentoManualFacade facade;
	
	public void execute(MovimentoManualDTO dto) {		
		doSetDefaults(dto);		
		facade.incluir(dto);		
	}

	private void doSetDefaults(MovimentoManualDTO dto) {
		Integer lancamento = facade.findMaxLancamentoByMesAno(dto);		
		dto.setNumeroLancamento((lancamento == null ? 0 : lancamento) + 1);
		dto.setUsuario("TESTE");
		dto.setData(LocalDateTime.now());
	}	

}
