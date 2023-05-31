package org.example.game.utils.Impl;

import lombok.Data;
import org.example.game.utils.Carta;

import java.util.List;

@Data
public class Jogada {

	private final List<Carta> cartas;

	public int getValue() {
		final int[] valor = {0};
		final int[] numAses = {0};

		cartas.stream().forEach(carta -> {
			valor[0] = valor[0] + carta.getValue();
			if (carta.getValue() == 11) {
				numAses[0]++;
			}
		});

		while (valor[0] > 21 && numAses[0] > 0) {
			valor[0] -= 10;
			numAses[0]--;
		}

		return valor[0];
	}

	public void exibirCartas() {
		cartas.stream().forEach(carta -> System.out.print(carta.getDisplay() + " "));
		System.out.println("\nValor total: " + getValue());
	}
}
