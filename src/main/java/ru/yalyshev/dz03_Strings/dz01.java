package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст: ");
		String text = scanner.nextLine();
		System.out.println(
				"Введите символ для проверки на совпадения в " + "тексте");
		String charector = scanner.nextLine();
		int sum = 1;
		int index = text.indexOf(charector);
		if (index == -1) {
			System.out.println("Совпадений не найдено.");
		}
		while (index != -1) {
			System.out.format("%d совпадение по индексу - %d \n", sum,
					index);
			index = text.indexOf(charector, index + 1);
			sum++;
			
		}
		
	}
}