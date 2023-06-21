package br.net.level.dataprocessor.domain.usecase;

import br.net.level.dataprocessor.domain.interfaces.IQtdUFDataProvider;
import br.net.level.dataprocessor.domain.usecase.qtduf.BuscarListagemQtdUFOutput;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Builder
public class BuscarListagemQtdUFUseCase {

	@Autowired
	@Qualifier("IQtdUFDataProvider")
	private IQtdUFDataProvider iQtdUFDataProvider;

	public List<BuscarListagemQtdUFOutput> executar() {

		return iQtdUFDataProvider.findQtdUF();

	}
}
