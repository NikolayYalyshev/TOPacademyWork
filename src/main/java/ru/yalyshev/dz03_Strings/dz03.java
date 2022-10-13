package ru.yalyshev.dz03_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class dz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст:");
		String str = scanner.nextLine();
		double sum = 0;
		String[] sS = str.split("\\ ");
		System.out.println(Arrays.toString(sS));
		for (int i = 0; i < sS.length; i++) {
			if (sS[i].contains(",")) {
				sum += sS[i].length() - 1;
			} else {
				sum += sS[i].length();
			}
		}
		double average = sum / sS.length;
		System.out.format("Средняя длина слова в тексте - %.3f", average);
	}
}
