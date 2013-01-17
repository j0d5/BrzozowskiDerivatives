package de.hska.BrzozowskiDerivatives;

public class EmptySet extends RegEx {

	@Override
	RegEx derivate(char c) {
		return new EmptySet();
	}

	@Override
	boolean containsEmptyWord() {
		// TODO Auto-generated method stub
		return false;
	}

}
