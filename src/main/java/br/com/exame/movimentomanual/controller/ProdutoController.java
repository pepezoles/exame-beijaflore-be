package br.com.exame.movimentomanual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exame.movimentomanual.model.ProdutoDTO;
import br.com.exame.movimentomanual.usecase.FindProduto;

@CrossOrigin("*")
@RestController
@RequestMapping("/produto")
public class ProdutoController {	
	
	@Autowired
	private FindProduto usecase;
	
	@GetMapping
	public ResponseEntity<Iterable<ProdutoDTO>> all() {
		return ResponseEntity.ok(usecase.findAll());
	}	
	
}


