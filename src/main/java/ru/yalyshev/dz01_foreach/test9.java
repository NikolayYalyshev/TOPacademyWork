package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите координаты первого числа по оси X: ");
		int aFirst = scanner.nextInt();
		System.out.println("Введите координаты первого числа по оси y: ");
		int aSecond = scanner.nextInt();
		System.out.println("Введите координаты второго числа по оси X: ");
		int bFirst = scanner.nextInt();
		System.out.println("Введите координаты второго числа по оси Y: ");
		int bSecond = scanner.nextInt();
		if (aFirst < bFirst & aSecond < bSecond) {
			System.out.println("Подъем");
		} else if (aFirst > bFirst & aSecond > bSecond) {
			System.out.println("Спуск");
		} else if (aFirst == bFirst) {
			System.out.println("Отвесная");
		} else if (aSecond == bSecond) {
			System.out.println("Ровная");
		}
	}
}
