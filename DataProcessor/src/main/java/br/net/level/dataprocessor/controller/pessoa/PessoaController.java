package br.net.level.dataprocessor.controller.pessoa;

import br.net.level.dataprocessor.domain.usecase.BuscarListagemPessoasUseCase;
import br.net.level.dataprocessor.domain.usecase.pessoa.BuscarListagemPessoasOutput;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/dados/pessoas")
public class DadosPessoaController {

	private final BuscarListagemPessoasUseCase buscarListagemPessoasUseCase;
	@GetMapping
	public ResponseEntity<BuscarListagemPessoasOutput> buscarListagemPessoas() {
		BuscarListagemPessoasOutput output = buscarListagemPessoasUseCase.executar();
		return new ResponseEntity<>(output, HttpStatus.OK);
	}
}
