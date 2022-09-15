package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		System.out.println("1 - кошка");
		System.out.println("2 - собака");
		System.out.println("3 - корова");
		System.out.println("4 - коза");
		System.out.println("5 - петух");
		System.out.println("6 - осел");
		System.out.println("7 - утка");
		System.out.println("8 - комар");
		System.out.println("9 - шмель");
		System.out.println("10 - волк");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выберете животное из списка");
		int x = scanner.nextInt();
		switch (x){
			case 1:
				System.out.println("КОШКА говорит - Мяу");
				break;
			case 2:
				System.out.println("СОБАКА говорит - Гав");
				break;
			case 3:
				System.out.println("КОРОВА говорит - Муу");
				break;
			case 4:
				System.out.println("КОЗА говорит - Бээ");
				break;
			case 5:
				System.out.println("ПЕТУХ говорит - Кукареку");
				break;
			case 6:
				System.out.println("ОСЕЛ говорит - Иаа");
				break;
			case 7:
				System.out.println("УТКА говорит - Кря");
				break;
			case 8:
				System.out.println("КОМАР говорит - Пии");
				break;
			case 9:
				System.out.println("ШМЕЛЬ говорит - Жжж");
				break;
			case 10:
				System.out.println("ВОЛК говорит - Ауф");
				break;
			default:
				System.out.println("Животное с таким номером не задано. " +
						"Выберете животное из списка указанных номеров!");
				break;
		}
	}
}
