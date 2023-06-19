package br.net.level.dataprocessor.domain.usecase;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import br.net.level.dataprocessor.domain.interfaces.IPessoaDataProvider;
import br.net.level.dataprocessor.domain.usecase.pessoa.BuscarListagemPessoasOutput;
import br.net.level.dataprocessor.domain.usecase.pessoa.converter.BuscarListagemPessoasOutputConverter;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Builder
public class BuscarListagemPessoasUseCase {

	@Autowired
	@Qualifier("IPessoaDataProvider")
	private IPessoaDataProvider iPessoaDataProvider;
	@Autowired
	private BuscarListagemPessoasOutputConverter outputConverter;

	public List<BuscarListagemPessoasOutput> executar() {
		List<Pessoa> listagem = iPessoaDataProvider.findAll();
		return outputConverter.converter(listagem);
	}
}
