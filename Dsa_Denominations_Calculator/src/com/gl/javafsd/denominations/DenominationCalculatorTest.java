package com.gl.javafsd.denominations;

public class DenominationCalculatorTest {

	public static void main(String[] args) {
		test(new int[] { 5, 1, 10 }, 12);
		test(new int[] { 60, 5, 12, 78, 25 }, 130);
		test(new int[] { 12, 5, 123, 18 }, 180);
		test(new int[] { 12, 5, 123, 18 }, 200);
		test(new int[] { 12, 5, 123, 18 }, 350);
		test(new int[] { 5, 0, 20 }, 33);
	}

	private static void test(int[] denominations, int paymentAmount) {

		System.out.println("--------------------------------------");
		DenominationCalculator calculator = new DenominationCalculator(denominations, paymentAmount);
		calculator.calculate();

	}

}
