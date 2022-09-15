package ru.yalyshev.dz02_loop;

public class zadacha6 {
	public static void main(String[] args) {
		//int a=0;
		for (int input = 10_000_000; input < 100_000_000; input++) {
			if (input % 12_345 == 0 && hasUniqDigits(input)) {
				System.out.println(input);
				
			}
		}
	}
	
	private static boolean hasUniqDigits(int input) {
		int rest = input;
		int[] digits = new int[8];
		int a = 0;
		while (rest > 0) {
			int digit = rest % 10;
			for (int i = 0; i < a; i++) {
				if (digits[i] == digit) {
					return false;
				}
			}
			digits[a++] = digit;
			rest /= 10;
		}
		return true;
	}
}
