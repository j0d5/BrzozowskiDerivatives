package de.hska.BrzozowskiDerivatives;

public class EmptyWord extends RegEx {

	@Override
	RegEx derivate(char c) {
		return new EmptySet();
	}

	@Override
	boolean containsEmptyWord() {
		return true;
	}

}
