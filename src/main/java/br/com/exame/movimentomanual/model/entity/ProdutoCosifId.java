package br.com.exame.movimentomanual.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
@Data
public class ProdutoCosifId implements Serializable {	

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "COD_PRODUTO", nullable = false)
	private Produto produto;
	
	@Column(name = "COD_COSIF", nullable = false)
	private Integer produtoCosifId;
	
}
