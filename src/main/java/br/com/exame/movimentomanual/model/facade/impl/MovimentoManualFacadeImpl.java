package br.com.exame.movimentomanual.model.facade.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;
import br.com.exame.movimentomanual.model.entity.MovimentoManual;
import br.com.exame.movimentomanual.model.facade.MovimentoManualFacade;
import br.com.exame.movimentomanual.model.mapper.MovimentoManualMapper;
import br.com.exame.movimentomanual.model.repository.MovimentoManualRepository;

@Component
public class MovimentoManualFacadeImpl implements MovimentoManualFacade {
	
	@Autowired
	private MovimentoManualRepository repository;
	
	@Autowired
	private MovimentoManualMapper mapper;	

	@Override
	public List<MovimentoManualDTO> findAll() {	
		return repository.findAll()
				.stream()
				.map(mapper::fromModel)
				.collect(Collectors.toList());		
	}
	
	@Override
	public Integer findMaxLancamentoByMesAno(MovimentoManualDTO dto) {
		return repository.findMaxLancamentoByMesAndAno(dto.getMes(), dto.getAno());
	}
	
	@Override
	public void incluir(MovimentoManualDTO dto) {
		MovimentoManual movimentoManual = mapper.fromDTO(dto);
		repository.save(movimentoManual);		
	}	

}
