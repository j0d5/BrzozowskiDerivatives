package de.hska.BrzozowskiDerivatives;

public class Letter extends RegEx {

	char actualChar;
	
	public Letter(char c) {
		actualChar = c;
	}

	@Override
	RegEx derivate(char c) {
		if (this.actualChar == c) {
			return new EmptyWord();
		} else {
			return new EmptySet();
		}
	}

	@Override
	boolean containsEmptyWord() {
		return false;
	}


}
