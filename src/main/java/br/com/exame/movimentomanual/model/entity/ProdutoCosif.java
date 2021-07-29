package br.com.exame.movimentomanual.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "PRODUTO_COSIF")
@Entity
@Data
@ToString
public class ProdutoCosif implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId		
	private ProdutoCosifId id;
	
	@Column(name = "COD_CLASSIFICACAO")
	private String classificacao;
	
	@Column(name = "STA_STATUS") 
	private String status;
	
	public Integer getProdutoCosifId() {
		if (id == null)
			return null;
		return id.getProdutoCosifId();
	}
	
	public Produto getProduto() {
		if (id == null || id.getProduto() == null)
			return null;		
		return id.getProduto();
	}
	
	
}
