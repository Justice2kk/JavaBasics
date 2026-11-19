package esquemesEssencials;

public class CercaEnCadenes {
	public static void main(String[] args) {
		// Cerca x trobar si lletra no es troba a vocals.
		
		String VOCALS = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
		boolean trobat = false;
		char lletra = Character.toUpperCase('c');
		
		int nVocals = 0;
		
		for (int j=0; j<VOCALS.length(); j++) {
			char vocal = VOCALS.charAt(j);
			
			if (lletra==vocal) {
				trobat = true;
				break;
			}
		}
		
		if (trobat) {
			nVocals ++;
		}
	}
}
