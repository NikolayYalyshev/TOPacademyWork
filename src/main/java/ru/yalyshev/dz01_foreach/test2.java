package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите время (количество часов):");
		int x = scanner.nextInt();
		if (x >= 0 && x < 8) {
			System.out.println("Доброй ночи");
		} else if (x >= 8 && x < 11) {
			System.out.println("Доброе утро");
		} else if (x >= 11 && x < 18) {
			System.out.println("Добрый день");
		} else if (x >= 18 && x < 23) {
			System.out.println("Добрый вечер");
		} else if (x >= 23 && x <= 24) {
			System.out.println("Доброй ночи");
		} else {
			System.out.println("Такого времени не существует");
		}
	}
}
