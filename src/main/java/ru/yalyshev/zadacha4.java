package ru.yalyshev;

public class zadacha4 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i + " - совершенное число");
			}
		}
	}
}
