package br.net.level.dataprocessor.domain.usecase.qtduf;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BuscarListagemQtdUFOutput implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "qtd")
	private String qtdPessoas;
	@Id
	@Column(name = "estado")
	private String estado;
}

