package game;

import java.util.Random;

public class GameLogic {
	private int currentPartitura;
	private final Random random = new Random();
	
	public int sortearPartitura() {
		currentPartitura = 1 + random.nextInt(16);
		return currentPartitura;
	}

	public int getCurrentPartitura() {
		return currentPartitura;
	}
	
	public boolean validarResposta(Note nota) {
		return nota.isCorrect(currentPartitura);
	}
	
	public String getImagePath() {
		for (Note nota : Note.values()) {
			if (nota.isCorrect(currentPartitura)) {
				return nota.getImagePath(currentPartitura);
			}
		}
		return null;
	}
}
