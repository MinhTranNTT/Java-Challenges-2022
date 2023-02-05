package com.apress.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _01_Fundamentals_01 {

	public static void main(String[] args) {
//		System.out.println(calc(6, 7));
//		System.out.println(calc(3, 4));
//		System.out.println(calc(5, 5));

//		calcSumAndCountAllNumbersDivBy_2_Or_7(3);
//		calcSumAndCountAllNumbersDivBy_2_Or_7(8);
//		calcSumAndCountAllNumbersDivBy_2_Or_7(15);
//		
//		System.out.println(calcSumAndCountAllNumbersDivBy_2_Or_7_v2(3));
//		System.out.println(calcSumAndCountAllNumbersDivBy_2_Or_7_v2(8));
//		System.out.println(calcSumAndCountAllNumbersDivBy_2_Or_7_v2(15));

//		System.out.println(numberAsText(7));
//		System.out.println(numberAsText(42));
//		numberAsText(24680);
//		numberAsText(13579);
		
//		System.out.println(numberAsText(7));
//		System.out.println(numberAsText(42));

//		System.out.println(numberAsText_v2(7));
//		System.out.println(numberAsText_v2(42));
		
//		System.out.println(calcPerfectNumbers(6));
//		System.out.println(calcPerfectNumbers(1000));
//		System.out.println(calcPerfectNumbers(10000));
	}

	/*
	 * Exercise 1a: Basic Arithmetic Operations Write method int calc(int, int) that
	 * multiplies two variables, m and n of type int, then divides the product by
	 * two, and outputs the remainder with respect to division by 7.
	 */

	public static int calc(int m, int n) {
		int result = 0;
		result = ((m * n) / 2) % 7;
		return result;
	}
	
	/*#############################################################################################################*/	
	
	/*
	 * Exercise 1b: Statistics Find the number as well as the sum of natural
	 * numbers, which are divisible by 2 or 7 up to a given maximum value
	 * (exclusive) and output it to the console.
	 * 
	 * Maximum Divisible by 2 Divisible by 7 Result Count Sum 3 2 -/- 1 2 8 2, 4, 6
	 * 7 4 19 15 2, 4, 6, 8, 10, 12, 14 7, 14 8 63
	 */

	public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int number) {
		int count = 0;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("Count: " + count + " - Sum: " + sum);
	}
	
	// Implementation
	enum RETURN_CODE {
		SUM, COUNT
	}
	
	public static Map<RETURN_CODE, Integer> calcSumAndCountAllNumbersDivBy_2_Or_7_v2(int number) {
		int count = 0;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				count++;
				sum += i;
			}
		}
		return Map.of(RETURN_CODE.SUM, sum, RETURN_CODE.COUNT, count);
	}

	/*#############################################################################################################*/
	
	/*
	 * Exercise 2: Number as Text Write method String numberAsText(int) which, for a
	 * given positive number, converts the respective digits into corresponding
	 * text.
	 * 
	 * 7 SEVEN 42 FOUR TWO
	 */

	public static String digitAsText(int number) {
		String valueAsText = "";
		int remainder = number % 10;
		switch (remainder) {
		case 0:
			valueAsText += "ZERO";
			break;
		case 1:
			valueAsText += "ONE";
			break;
		case 2:
			valueAsText += "TWO";
			break;
		case 3:
			valueAsText += "THREE";
			break;
		case 4:
			valueAsText += "FOUR";
			break;
		case 5:
			valueAsText += "FIVE";
			break;
		case 6:
			valueAsText += "SIX";
			break;
		case 7:
			valueAsText += "SEVEN";
			break;
		case 8:
			valueAsText += "EIGHT";
			break;
		case 9:
			valueAsText += "NIGHT";
			break;
		default:
			break;
		}
		return valueAsText;
	}
	
	public static String numberAsText(int number) {
		String value = "";
		int remainValue = number;
		
		while(remainValue > 0) {
			String tmpText = digitAsText(remainValue%10);
			value = tmpText + " " + value;
			remainValue /= 10;
		}
		
		return value.trim();
	}
	
	// Implementation 
	public static Map<Integer, String> mapValueToText = 
			Map.of(0, "ZERO", 1, "ONE", 2, "TWO", 3, "THREE", 4, "FOUR", 5, "FIVE", 6, "SIX", 7, "SEVEN", 8, "EIGHT", 9, "NINE");
	
	public static String numberAsText_v2(int number) {
		String value = "";
		int remainValue = number;
		while(remainValue > 0) {
			String tmpText = mapValueToText.get(remainValue%10);
			value = tmpText + " " + value;
			remainValue /= 10;
		}
		return value.trim();
	}
	
	/*#############################################################################################################*/
	
	/*
	 * By definition, a natural number is called a perfect number if its value is
	 * equal to the sum of its real divisors. This is true, for example, for the
	 * numbers 6 and 28:
	 */
	
	public static boolean isPerfectNumberSimple(int number) {
		int sumOfMultipliers = 1;
		for (int i=2; i <= number/2; i++) {
			if (number%i == 0) {
				sumOfMultipliers += i;
			}
		}
		return number == sumOfMultipliers;
	}
	
	public static List<Integer> calcPerfectNumbers(int maxValue) {
		List<Integer> results = new ArrayList<>();
		for (int i=2; i<maxValue; i++) {
			if (isPerfectNumberSimple(i)) {
				results.add(i);
			}
		}
		return results;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
