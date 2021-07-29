package br.com.exame.movimentomanual.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MovimentoManualDTO {	
	
	@NotNull
	private Integer mes;
	
	@NotNull
	private Integer ano;
	private Integer numeroLancamento;
	
	@NotEmpty
	private String descricao;
	private LocalDateTime data;
	
	@NotNull
	private Double valor;
	
	private String usuario;
	
	@NotNull
	private ProdutoCosifDTO produtoCosif;
}
