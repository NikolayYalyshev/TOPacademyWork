package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст (используйте заглавыне и строчные " +
				"символы, а также цифры):");
		String str = scanner.nextLine();
		char[] chars = str.toCharArray();
		String numbers = "\\d";
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				chars[i] = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				chars[i] = Character.toUpperCase(c);
			} else if (Character.isDigit(c)) {
				chars[i] = '_';
			}
		}
		System.out.println(new String(chars));
	}
}
