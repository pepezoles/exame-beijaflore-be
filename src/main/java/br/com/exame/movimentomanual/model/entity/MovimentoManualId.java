package br.com.exame.movimentomanual.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
@Data
public class MovimentoManualId implements Serializable {	

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "COD_PRODUTO")	
	@JoinColumn(name = "COD_COSIF")
	private ProdutoCosif produtoCosif;
	
	@Column(name = "DAT_MES")
	private Integer mes;
	
	@Column(name = "DAT_ANO")
	private Integer ano;
	
	@Column(name = "NUM_LANCAMENTO")
	private Integer numeroLancamento;
	
}
