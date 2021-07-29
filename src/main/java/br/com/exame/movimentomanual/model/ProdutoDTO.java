package br.com.exame.movimentomanual.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProdutoDTO {
	
	@NotNull
	private Integer produtoId;
	private String descricao;
	private String status;
}
