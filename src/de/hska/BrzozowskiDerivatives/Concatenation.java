package de.hska.BrzozowskiDerivatives;

public class Concatenation extends RegEx {

	RegEx e1;
	RegEx e2;
	
	Concatenation(RegEx e1, RegEx e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	RegEx derivate(char c) {
		if (e1.containsEmptyWord()) {
			return new Choice(new Concatenation(e1.derivate(c), e2), e2.derivate(c));
		} else {
			return new Concatenation(e1.derivate(c), e2);	
		}
		
	}

	@Override
	boolean containsEmptyWord() {
		if (e1.containsEmptyWord() && e2.containsEmptyWord())
			return true;
		else
			return false;
	}

}
