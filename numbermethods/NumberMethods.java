package practice;

/**
 *Author: Ayden Bales
 *Date: Jan 22, 2021
 *Description: Number Methods Project
 */

public class NumberMethods {
	
	public static boolean isPrime(int n) {
		//This method should set prime true if n is prime.
		//This method should set prime false if n is composite.
		//This method should return isPrime;
		//n >= 2
		boolean prime = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		
		return prime;
	}
	
	public static int divisorSum(int n) {
		int sum = 0;
		/*
		This method should return the sum of all of the divisors of n
		if divisorSum(8) is called, a value of 7 should be returned because
		the proper divisors of 8 are 1, 2, and 4.
		
		divisorSum(15) = 9
		*/
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		/*
		 A number is considered strong if it is:
		 1) Greater than the sum of its divisors 
		 AND
		 2) A composite number
		 */
		
		/*
		 A number is considered weak if it is:
		 1) Less than the sum of its divisors
		 AND
		 2) A composite number
		 */
		
		/*
		 * This method should check if n is strong.
		 * The call isStrong(8) should return true because 8 > (1 + 2 + 4) = 7
		 * The call isStrong(12) should return false because 12 < (1 + 2 + 3 + 4 + 6) = 16
		 */
		
		//This method MUST use the divisorSum and isPrime method
		
		if (n > divisorSum(n) && !isPrime(n)) {
			strong = true;
		}
		
		return strong;
	}
	
	public static void printDivisors(int n) {
		 /*
		 This method should print the divisors of n (not including n)
		 on a single line.
		 If printDivisors(12) is called, 1 2 3 4 6		should be printed.
		 */
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printPrimes(int n) {
		//This method prints all prime numbers less than n on a single line
		//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
		//This method MUST use the isPrime method
		
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printComposites(int n) {
		//This method prints all composite numbers less than n on a single line
		//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
		//This method MUST use the isPrime method
		
		for (int i = 3; i < n; i++) {
			if (!isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printStrong(int n) {
		//This method prints all the strong numbers less than n on a single line
		//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22 25 26 27
		//This method MUST use the isStrong method
		
		for (int i = 3; i < n; i++) {
			if (isStrong(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void printWeak(int n) {
		//This method prints all the weak numbers less than n on a single line
		//The call printWeak(30) should print 6 12 18 20 24 28
		//This method MUST use the isStrong method
		
		for (int i = 3; i < n; i++) {
			if (!isStrong(i) && !isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printComposites(30);
		printPrimes(30);
		printStrong(30);
		printWeak(30);
	}

}
