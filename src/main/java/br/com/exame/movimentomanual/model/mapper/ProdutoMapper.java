package br.com.exame.movimentomanual.model.mapper;

import org.mapstruct.Mapper;

import br.com.exame.movimentomanual.model.ProdutoDTO;
import br.com.exame.movimentomanual.model.entity.Produto;

@Mapper
public interface ProdutoMapper {
	
	ProdutoDTO fromModel(Produto entity);

}
