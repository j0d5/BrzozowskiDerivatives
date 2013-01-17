package de.hska.BrzozowskiDerivatives;

public class Choice extends RegEx {

	RegEx e1;
	RegEx e2;
	
	Choice(RegEx e1, RegEx e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	RegEx derivate(char c) {
		return new Choice(e1.derivate(c), e2.derivate(c));
	}

	@Override
	boolean containsEmptyWord() {
		if (e1.containsEmptyWord() || e2.containsEmptyWord())
			return true;
		else
			return false;
	}

}
