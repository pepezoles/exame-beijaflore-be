package br.com.exame.movimentomanual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exame.movimentomanual.model.ProdutoCosifDTO;
import br.com.exame.movimentomanual.usecase.FindProdutoCosif;

@CrossOrigin("*")
@RestController
@RequestMapping("/produto-cosif")
public class ProdutoCosifController {	
	
	@Autowired
	private FindProdutoCosif usecase;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Iterable<ProdutoCosifDTO>> findByProdutoId(@PathVariable("id") Integer id ) {
		return ResponseEntity.ok(usecase.findByProdutoId(id));
	}	
	
}


