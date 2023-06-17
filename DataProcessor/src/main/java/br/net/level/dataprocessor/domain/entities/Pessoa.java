package br.net.level.dataprocessor.entities;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Pessoa implements Serializable {

	private String nome;

	private String cpf;

	private String rg;

	private String data_nasc;

	private String sexo;

	private String mae;

	private String pai;

	private String email;

	private String cep;

	private String endereco;

	private String numero;

	private String bairro;

	private String cidade;

	private String estado;

	private String telefone_fixo;

	private String celular;

	private Integer altura;

	private Integer peso;

	private String tipo_sanguineo;
}
