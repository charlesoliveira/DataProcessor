package org.example.game.entities;

import lombok.Data;
import org.example.game.utils.Impl.Jogada;

@Data
public class Jogador {

		private final String nome;
		private final Jogada jogada;
}
