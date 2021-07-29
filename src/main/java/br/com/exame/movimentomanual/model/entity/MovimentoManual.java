package br.com.exame.movimentomanual.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "MOVIMENTO_MANUAL")
@Entity
@Data
@ToString
public class MovimentoManual implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId		
	private MovimentoManualId id;
	
	@Column(name = "DES_DESCRICAO")
	private String descricao;
	
	@Column(name = "DAT_MOVIMENTO") 
	private LocalDateTime data;
	
	@Column(name = "COD_USUARIO")
	private String usuario;
	
	@Column(name = "VAL_VALOR", length = 18, precision = 2, nullable = false)
	private Double valor;

}
