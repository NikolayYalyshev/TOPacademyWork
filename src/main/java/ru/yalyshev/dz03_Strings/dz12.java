package ru.yalyshev.dz03_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dz12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите символы: ");
		String str = scanner.nextLine();
		String regex = "[\\:\\;][\\-]*([\\(]+|[\\)]+|[\\[]+|[\\]]+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println("Вы ввели: " + str);
		int count = 0;
		while (matcher.find()){
			count++;
		}
		if (count == 1) {
			System.out.println("В строке содержится " + count + " смайлик");
		} else if (count == 2 || count == 3 || count == 4 ){
			System.out.println("В строке содержится " + count + " смайлика");
		} else if (count % 10 == 1) {
			System.out.println("В строке содержится " + count + " смайлик");
		} else if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
			System.out.println("В строке содержится " + count + " смайлика");
		} else {
			System.out.println("В строке содержится " + count + " смайликов");
		}
	}
}

