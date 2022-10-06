package ru.yalyshev.dz03_Strings;

import java.util.Scanner;

public class dz10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		String str = scanner.nextLine();
		int strLength = str.length();
		for (int i = strLength - 1; i > - strLength; i--) {
			for (int j = 0; j < strLength; j++) {
				if (j < i) {
					System.out.print(" ");
				} else if (j >= i + strLength) {
					System.out.print(" ");
				} else {
					System.out.print(str.charAt(j - i));
				}
			}
			System.out.println();
		}
	}
}

