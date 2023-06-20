package br.net.level.dataprocessor.controller.pessoa;

import br.net.level.dataprocessor.domain.entities.QtdUFDto;
import br.net.level.dataprocessor.domain.usecase.BuscarListagemQtdUFUseCase;
import br.net.level.dataprocessor.domain.usecase.qtduf.BuscarListagemQtdUFOutput;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/dados/qtdUF")
public class QtdUFController {

	@Autowired
	private final BuscarListagemQtdUFUseCase buscarListagemQtdUFUseCase;
	@GetMapping
	public ResponseEntity<List<QtdUFDto>> buscarListagemQtdUF() {
		List<QtdUFDto> output = buscarListagemQtdUFUseCase.executar();
		return new ResponseEntity<>(output, HttpStatus.OK);
	}
}
