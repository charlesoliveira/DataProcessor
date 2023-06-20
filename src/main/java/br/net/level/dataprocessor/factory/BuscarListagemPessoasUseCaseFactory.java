package br.net.level.dataprocessor.factory;

import br.net.level.dataprocessor.domain.usecase.BuscarListagemPessoasUseCase;
import br.net.level.dataprocessor.domain.usecase.pessoa.converter.BuscarListagemPessoasOutputConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class BuscarListagemPessoasUseCaseFactory {

	@Bean
	@DependsOn({"criarBuscarListagemPessoasOutputConverter"})
	public BuscarListagemPessoasUseCase criarBuscarListagemPessoasUseCase(BuscarListagemPessoasOutputConverter outputConverter) {
		return BuscarListagemPessoasUseCase.builder()
				.build();
	}

	@Bean
	public BuscarListagemPessoasOutputConverter criarBuscarListagemPessoasOutputConverter() {
		return BuscarListagemPessoasOutputConverter.builder().build();
	}
}
