package br.com.exame.movimentomanual.controller.response;

import lombok.Data;

@Data
public class DefaultResponse<T> {
	
	private T response;

}
