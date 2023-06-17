package br.net.level.dataprocessor.domain.interfaces;

import br.net.level.dataprocessor.domain.entities.Pessoa;

import java.util.List;

public interface IPessoasDataProvider {

	List<Pessoa> buscarListagemPessoas();
}
