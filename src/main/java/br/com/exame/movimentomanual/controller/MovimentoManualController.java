package br.com.exame.movimentomanual.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exame.movimentomanual.model.MovimentoManualDTO;
import br.com.exame.movimentomanual.usecase.FindMovimentoManual;
import br.com.exame.movimentomanual.usecase.IncluirMovimentoManual;

@CrossOrigin("*")
@RestController
@RequestMapping("/movimento-manual")
public class MovimentoManualController {

	@Autowired
	private FindMovimentoManual findMovimentoManual;

	@Autowired
	private IncluirMovimentoManual incluirMovimentoManual;

	@GetMapping
	public ResponseEntity<Iterable<MovimentoManualDTO>> all() {
		return ResponseEntity.ok(findMovimentoManual.findAll());
	}

	
	@PostMapping
	public ResponseEntity<?> incluir(@Valid @RequestBody MovimentoManualDTO dto) {
		try {
			incluirMovimentoManual.execute(dto);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
