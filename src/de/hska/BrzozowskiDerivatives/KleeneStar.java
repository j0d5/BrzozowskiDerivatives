package de.hska.BrzozowskiDerivatives;

public class KleeneStar extends RegEx {

	RegEx e;
	
	public KleeneStar(RegEx e) {
		this.e = e;
	}
	
	@Override
	RegEx derivate(char c) {
		return new Concatenation(e.derivate(c), new KleeneStar(e));
	}

	@Override
	boolean containsEmptyWord() {
		return true;
	}

}
