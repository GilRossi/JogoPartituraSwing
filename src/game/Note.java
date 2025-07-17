package game;

public enum Note {
	LA("A = LA", new int[] {6, 13}, "la"),
	SI("B = SI", new int[] {5, 12}, "si"),
	DO("C = DO", new int[] {4, 11}, "do"),
	RE("R = RE", new int[] {3, 10}, "re"),
	MI("E = MI", new int[] {2, 9, 16}, "mi"),
	FA("F = FA", new int[] {1, 8, 15}, "fa"),
	SOL("G = SOL", new int[] {7, 14}, "sol");
	
	private final String label;
	private final int[] indices;
	private final String imagePrefix;
	
	Note(String label, int[] indices, String imagePrefix){
		this.label = label;
		this.indices = indices;
		this.imagePrefix = imagePrefix;
	}
	
	public String getLabel() {
		return label;
	}
	
	public boolean isCorrect(int partitura) {
		for(int i : indices) {
			if (i == partitura)return true;			
		}
		return false;
	}
	
	public String getImagePath(int partitura) {
		return "/tela/resources/images/" + imagePrefix + partitura + ".png";
	}

}
