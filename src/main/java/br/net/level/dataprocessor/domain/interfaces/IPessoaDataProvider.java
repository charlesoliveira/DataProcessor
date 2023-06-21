package br.net.level.dataprocessor.domain.interfaces;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import br.net.level.dataprocessor.domain.usecase.pessoa.BuscarListagemPessoasOutput;
import br.net.level.dataprocessor.domain.usecase.qtduf.BuscarListagemQtdUFOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPessoaDataProvider extends JpaRepository<Pessoa, Long> {

}
