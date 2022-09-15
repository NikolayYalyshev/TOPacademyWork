package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int x = scanner.nextInt();
		System.out.println("Введите второе число:");
		int y = scanner.nextInt();
		int a = x % 2;
		int b = y % 2;
		if (a == 0 & b == 0 || a > 0 & b > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("null");
		}
	}
}
