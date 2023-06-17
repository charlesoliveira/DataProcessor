package br.net.level.dataprocessor.domain.usecase.pessoa.converter;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import br.net.level.dataprocessor.domain.usecase.pessoa.BuscarListagemPessoasOutput;
import lombok.Builder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Builder
public class BuscarListagemPessoasOutputConverter {
	public BuscarListagemPessoasOutput converter(List<Pessoa> listagem) {
		return BuscarListagemPessoasOutput.builder()
				.pessoas(listagem.stream().map(item -> Pessoa.builder()
							.nome(item.getNome())
						.email(item.getEmail())
						.estado(item.getEstado())
						.telefone_fixo(item.getTelefone_fixo())
						.celular(item.getCelular())
							.build()
				).collect(Collectors.toList()))
				.build();
	}
}
