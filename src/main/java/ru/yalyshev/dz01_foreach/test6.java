package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите год:");
		int x = scanner.nextInt();
		int a = x % 4;
		int b = x % 100;
		int c = x % 400;
		if (a == 0 && b != 0 || c == 0) {
			System.out.println("В этом году 366 дней");
		} else {
			System.out.println("В этом году 365 дней");
		}
	}
}