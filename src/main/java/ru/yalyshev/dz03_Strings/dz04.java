package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение:");
		String str = scanner.nextLine();
		String lowCaseStr = str.toLowerCase();
		String[] strArray = lowCaseStr.split(" ");
		String vowelsFirst = "^[aeoiuy].*";
		String consonantsLast = ".*[qwrtpsdfghjklmnbvcxz]$";
		for (String word : strArray) {
			if (word.matches(vowelsFirst) && word.matches(consonantsLast)) {
				System.out.println(word);
			}
		}
	}
}

