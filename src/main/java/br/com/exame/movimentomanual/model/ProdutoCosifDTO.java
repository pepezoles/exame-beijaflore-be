package br.com.exame.movimentomanual.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProdutoCosifDTO {
	
	@NotNull
	private Integer produtoCosifId;
	private ProdutoDTO produto;
	private String classificacao;
	private String status;
	
}
