package br.net.level.dataprocessor.domain.usecase.pessoa.converter;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import br.net.level.dataprocessor.domain.usecase.pessoa.BuscarListagemPessoasOutput;
import lombok.Builder;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Builder
public class BuscarListagemPessoasOutputConverter {
	public List<BuscarListagemPessoasOutput> converter(List<Pessoa> listagem) {
		List<BuscarListagemPessoasOutput> output = listagem.stream().map(item -> BuscarListagemPessoasOutput.builder()
				.nome(item.getNome())
				.cpf(item.getCpf())
				.rg(item.getRg())
				.data_nasc(item.getData_nasc())
				.sexo(item.getSexo())
				.mae(item.getMae())
				.pai(item.getPai())
				.email(item.getEmail())
				.cep(item.getCep())
				.endereco(item.getEndereco())
				.numero(item.getNumero())
				.bairro(item.getBairro())
				.cidade(item.getCidade())
				.estado(item.getEstado())
				.telefone_fixo(item.getTelefone_fixo())
				.celular(item.getCelular())
				.altura(item.getAltura())
				.peso(item.getPeso())
				.tipo_sanguineo(item.getTipo_sanguineo())
				.build()).collect(Collectors.toList());
		return output;
		/*		return BuscarListagemPessoasOutput.builder()
				.pessoas(listagem.stream().map(item -> Pessoa.builder()
							.nome(item.getNome())
						.email(item.getEmail())
						.estado(item.getEstado())
						.telefone_fixo(item.getTelefone_fixo())
						.celular(item.getCelular())
							.build()
				).collect(Collectors.toList()))
				.build();*/
	}
}
