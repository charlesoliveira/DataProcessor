package br.net.level.dataprocessor.domain.usecase.qtduf.converter;

import br.net.level.dataprocessor.domain.entities.QtdUFDto;
import br.net.level.dataprocessor.domain.usecase.qtduf.BuscarListagemQtdUFOutput;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public class BuscarListagemQtdUFOutputConverter {

	public List<BuscarListagemQtdUFOutput> converter (List<QtdUFDto> listagem){

		List<BuscarListagemQtdUFOutput> output = listagem.stream().map(item -> BuscarListagemQtdUFOutput.builder()
				.qtdPessoas(item.getQtdPessoas())
				.estado(item.getEstado())
				.build()).collect(Collectors.toList());
		return output;

	}
}
