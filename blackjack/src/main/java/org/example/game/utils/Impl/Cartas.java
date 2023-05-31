package org.example.game.utils.Impl;

import lombok.Data;
import org.example.game.utils.Carta;

@Data
public class Cartas implements Carta {

	private final int value;
	private final String display;

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getDisplay() {
		return display;
	}

}
