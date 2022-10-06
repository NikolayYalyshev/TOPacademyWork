package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz02 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for (int j = 1; ; j++) {
			if (str.length() >= 1000) {
				str = new StringBuilder(str.substring(0, 1000));
				break;
			}
			str.append(j);
		}
		System.out.println(str);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите желаемый индекс (от 1 до 1000): ");
		int index = scanner.nextInt();
		while (index < 1 || index > 1000) {
			index = scanner.nextInt();
		}
		char number = str.charAt(index-1);
		System.out.println(number);
		
	}
}
