package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст");
		String text = scanner.nextLine();
		String[] words = text.split("[\\s:]+");
		int sum = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
				System.out.println(words[i]);
				sum++;
			}
		}
		System.out.println(sum);
	}
}
