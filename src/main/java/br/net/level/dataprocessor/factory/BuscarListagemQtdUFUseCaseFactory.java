package br.net.level.dataprocessor.factory;

import br.net.level.dataprocessor.domain.usecase.BuscarListagemPessoasUseCase;
import br.net.level.dataprocessor.domain.usecase.BuscarListagemQtdUFUseCase;
import br.net.level.dataprocessor.domain.usecase.pessoa.converter.BuscarListagemPessoasOutputConverter;
import br.net.level.dataprocessor.domain.usecase.qtduf.converter.BuscarListagemQtdUFOutputConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class BuscarListagemQtdUFUseCaseFactory {

	@Bean
	@DependsOn({"criarBuscarListagemQtdUFOutputConverter"})
	public BuscarListagemQtdUFUseCase criarBuscarListagemQtdUFUseCase(BuscarListagemQtdUFOutputConverter outputConverter) {
		return BuscarListagemQtdUFUseCase.builder()
				.build();
	}

	@Bean
	public BuscarListagemQtdUFOutputConverter criarBuscarListagemQtdUFOutputConverter() {
		return BuscarListagemQtdUFOutputConverter.builder().build();
	}
}
