package br.net.level.dataprocessor.domain.usecase.pessoa;

import br.net.level.dataprocessor.domain.entities.Pessoa;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BuscarListagemPessoasOutput {

	public String nome;

	public String cpf;

	public String rg;

	public String data_nasc;

	public String sexo;

	public String mae;

	public String pai;

	public String email;

	public String cep;

	public String endereco;

	public Integer numero;

	public String bairro;

	public String cidade;

	public String estado;

	public String telefone_fixo;

	public String celular;

	public Double altura;

	public Integer peso;

	public String tipo_sanguineo;

/*	public List<Pessoa> pessoas;


	@Builder
	@Data
	public static class PessoaOutput {

		public String nome;

		public String email;

		public String estado;

		public String celular;
	}*/

}
