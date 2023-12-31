package br.net.level.dataprocessor.domain.entities;

import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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

	private Integer numero;

	private String bairro;

	private String cidade;

	private String estado;

	private String telefone_fixo;

	private String celular;

	private Double altura;

	private Integer peso;

	private String tipo_sanguineo;
}
