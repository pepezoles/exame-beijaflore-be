package br.com.exame.movimentomanual.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "PRODUTO")
@Entity
@Data
@ToString
@NoArgsConstructor
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id		
	@Column(name = "COD_PRODUTO")	
	private Integer produtoId;
	
	@Column(name = "DES_PRODUTO")
	private String descricao;
	
	@Column(name = "STA_STATUS") 
	private String status;

	public Produto(Integer produtoId) {
		super();
		this.produtoId = produtoId;
	}	
	
}
