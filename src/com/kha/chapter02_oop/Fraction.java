package com.kha.chapter02_oop;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String print() {
		return this.getNumerator() + "/" + this.getDenominator();
	}

	public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
        fractionA.normalize();
        fractionB.normalize();
		switch (operator) {
		case "+":
			this.add(fractionA, fractionB);
			break;
		case "-":
			this.sub(fractionA, fractionB);
			break;
		case "*":
		case "x":
		case "X":
		case ".":
			this.multiply(fractionA, fractionB);
		case ":":
		case "/":
			this.divide(fractionA, fractionB);
			break;
		default:
			break;
		}
	}

	private void divide(Fraction fractionA, Fraction fractionB) {
		// TODO Auto-generated method stub
		System.out.println("Divide:");
	}

	private void multiply(Fraction fractionA, Fraction fractionB) {
		// TODO Auto-generated method stub
		System.out.println("Multiple:");
	}

	private void sub(Fraction fractionA, Fraction fractionB) {
		// TODO Auto-generated method stub
		System.out.println("Sub:");
	}

	private void add(Fraction fractionA, Fraction fractionB) {
		// TODO Auto-generated method stub
		//System.out.println("Add:");
		this.setNumerator(fractionA.getNumerator()*fractionB.getDenominator()+fractionB.getNumerator()*fractionA.getDenominator());
		this.setDenominator(fractionA.getDenominator()*fractionB.getDenominator());
		normalize();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public boolean checkNormalize() {
		boolean flag = false;
		int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
		if (ucln == 1)
			flag = true;
		return flag;
	}

	public void normalize() {
		int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
		if (checkNormalize() == false) {
			this.numerator = numerator / ucln;
			this.denominator = denominator / ucln;
			System.out.println("Phan so sau khi rut gon:" + this.numerator + "/" + this.denominator);
		} else {
			System.out.println("Phan so da toi gian");
		}
	}

	private int UCLN(int x, int y) {
		int result = Math.min(x, y);

		while (result >= 1) {
			if (x % result == 0 && y % result == 0)
				return result;
			result--;
		}
		return result;
	}
}
