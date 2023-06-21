package com.kha.chapter02_oop;

public class Main {
	public static void main(String[] args) {
		Fraction fractionA = new Fraction(1, 4);
		Fraction fractionB = new Fraction(5, 4);
		System.out.println(fractionA.print());
		System.out.println(fractionB.print());
//
//		if (fractionA.checkNormalize() == true) {
//			System.out.println(fractionA.print() + " da toi gian");
//		} else {
//			System.out.println(fractionA.print() + " chua toi gian");
//		}

		// fractionA.normalize();

		Fraction fraction = new Fraction(fractionA, fractionB, "+");
		System.out.printf("%s + %s = %s", fractionA.print(), fractionB.print(), fraction.print());

	}
}
