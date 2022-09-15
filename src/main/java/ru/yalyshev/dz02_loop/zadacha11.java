package ru.yalyshev.dz02_loop;

public class zadacha11 {
	public static void main(String[] args) {
		final String fizz = "fizz";
		final String buzz = "buzz";
		final String hiss = "hiss";
		for (int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) & (i % 5 == 0)) {
				System.out.println(hiss);
			} else if (i % 3 == 0) {
				System.out.println(fizz);
			} else if (i % 5 == 0) {
				System.out.println(buzz);
			} else {
				System.out.println(i);
			}
		}
	}
}