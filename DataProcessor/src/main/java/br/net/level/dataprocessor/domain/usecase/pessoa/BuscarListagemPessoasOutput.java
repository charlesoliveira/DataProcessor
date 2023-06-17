package br.net.level.dataprocessor.domain.usecase.pessoa;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BuscarListagemPessoasOutput {


	private List<Pessoa> pessoas;


	@Builder
	@Data
	private static class PessoaOutput {

		private String nome;

		private String email;

		private String estado;

		private String celular;
	}

}
