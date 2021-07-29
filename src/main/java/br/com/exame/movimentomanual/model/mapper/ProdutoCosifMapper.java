package br.com.exame.movimentomanual.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.exame.movimentomanual.model.ProdutoCosifDTO;
import br.com.exame.movimentomanual.model.entity.ProdutoCosif;

@Mapper
public interface ProdutoCosifMapper {

	@Mapping(target = "produtoCosifId", source = "entity.id.produtoCosifId")
	ProdutoCosifDTO fromModel(ProdutoCosif entity);
	
}
