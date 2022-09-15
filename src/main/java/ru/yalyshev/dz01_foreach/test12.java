package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		final int max = 999_999;
		final int min = 100_000;
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		System.out.printf("Введите число от %d до %d\n", min, max);
		do {
			number = scanner.nextInt();
		} while (number <= min && number > max);
		int subNumber1 = number / 1000;
		int subNumber2 = number % 1000;
		int luck1 = 0;
		int luck2 = 0;
		while (subNumber1 > 0) {
			luck1 += subNumber1 % 10;
			subNumber1 /= 10;
		}
		while (subNumber2 > 0) {
			luck2 += subNumber2 % 10;
			subNumber2 /= 10;
		}
		if (luck1 == luck2) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}
	}
}