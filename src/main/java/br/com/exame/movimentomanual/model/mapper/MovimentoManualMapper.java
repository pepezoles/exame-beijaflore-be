package br.com.exame.movimentomanual.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;
import br.com.exame.movimentomanual.model.entity.MovimentoManual;

@Mapper
public interface MovimentoManualMapper {
	
	@Mapping(target = "mes", source = "id.mes")
	@Mapping(target = "ano", source = "id.ano")
	@Mapping(target = "numeroLancamento", source = "id.numeroLancamento")		
	@Mapping(target = "produtoCosif", source = "id.produtoCosif")		
	MovimentoManualDTO fromModel(MovimentoManual entity);
	
	
	@Mapping(target = "id.mes", source = "mes")
	@Mapping(target = "id.ano", source = "ano")
	@Mapping(target = "id.numeroLancamento", source = "numeroLancamento")	
	@Mapping(target = "id.produtoCosif", source = "produtoCosif")
	@Mapping(target = "id.produtoCosif.id.produtoCosifId", source = "produtoCosif.produtoCosifId")
	@Mapping(target = "id.produtoCosif.id.produto.produtoId", source = "produtoCosif.produto.produtoId")	
	MovimentoManual fromDTO(MovimentoManualDTO dto);
	
}
