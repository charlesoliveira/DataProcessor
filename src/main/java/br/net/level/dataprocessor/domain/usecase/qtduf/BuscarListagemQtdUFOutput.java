package br.net.level.dataprocessor.domain.usecase.qtduf;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuscarListagemQtdUFOutput {

	private String qtdPessoas;

	private String estado;
}
