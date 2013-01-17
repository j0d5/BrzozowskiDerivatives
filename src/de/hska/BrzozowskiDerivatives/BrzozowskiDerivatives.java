package de.hska.BrzozowskiDerivatives;

public class BrzozowskiDerivatives {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String regExpression = "(AB + A)(BAA + A)(AC + C)";

		Letter a = new Letter('A');
		Letter b = new Letter('B');
		Letter c = new Letter('C');

		// (AB + A)
		Concatenation conc1 = new Concatenation(a, b);
		Choice choice1 = new Choice(conc1, b);

		System.out.println("(AB + A)\t"
				+ choice1.derivate('A').derivate('B').containsEmptyWord());

		// (BAA + A)
		Concatenation conc2 = new Concatenation(new Concatenation(b, a), a);
		Choice choice2 = new Choice(conc2, a);

		System.out.println("(BAA + A)\t"
				+ choice2.derivate(b.actualChar).derivate(a.actualChar)
						.derivate(a.actualChar).containsEmptyWord());
		System.out.println("(B)\t"
				+ choice2.derivate(b.actualChar).containsEmptyWord());

		Concatenation conc3 = new Concatenation(a, c);
		Choice choice3 = new Choice(conc3, c);

		System.out.println("(AC + C)\t"
				+ choice3.derivate(a.actualChar).derivate(c.actualChar)
						.containsEmptyWord());
		System.out.println("(C)\t"
				+ choice3.derivate(c.actualChar).containsEmptyWord());
		System.out.println("(A)\t"
				+ choice3.derivate(a.actualChar).containsEmptyWord());

		// (A + B)*
		Choice choice4 = new Choice(a, b);
		KleeneStar kleene = new KleeneStar(choice4);
		System.out.println("(A + B)*\t"
				+ kleene.derivate(a.actualChar).derivate(a.actualChar)
						.derivate(b.actualChar).containsEmptyWord());

	}

}
