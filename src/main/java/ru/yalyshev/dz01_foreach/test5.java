package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите год рождения:");
		int year = scanner.nextInt();
		System.out.println("Введите день:");
		int date = scanner.nextInt();
		System.out.println("Введите месяц:");
		int this_month = scanner.nextInt();
		switch (year % 12) {
			case 0:
				System.out.println("Год: Обезьяны");
				break;
			case 1:
				System.out.println("Год: Петуха");
				break;
			case 2:
				System.out.println("Год: Собаки");
				break;
			case 3:
				System.out.println("Год: Свиньи");
				break;
			case 4:
				System.out.println("Год: Крысы");
				break;
			case 5:
				System.out.println("Год: Быка");
				break;
			case 6:
				System.out.println("Год: Тигра");
				break;
			case 7:
				System.out.println("Год: Зайца");
				break;
			case 8:
				System.out.println("Год: Дракона");
				break;
			case 9:
				System.out.println("Год: Змеи");
				break;
			case 10:
				System.out.println("Год: Лошади");
				break;
			default:
				System.out.println("Год: Овец");
				break;
		}
		
		if (this_month == 1 && date >= 20 || this_month == 2 && date <= 18) {
			System.out.println("Знак: Водолей");
		} else if (this_month == 2 && date >= 19 ||
				this_month == 3 && date <= 20) {
			System.out.println("Знак: Рыбы");
		} else if (this_month == 3 && date >= 21 ||
				this_month == 4 && date <= 19) {
			System.out.println("Знак: Овен");
		} else if (this_month == 4 && date >= 20 ||
				this_month == 5 && date <= 20) {
			System.out.println("Знак: Телец");
		} else if (this_month == 5 && date >= 21 ||
				this_month == 6 && date <= 21) {
			System.out.println("Знак: Близнецы");
		} else if (this_month == 6 && date >= 22 ||
				this_month == 7 && date <= 22) {
			System.out.println("Знак: Рак");
		} else if (this_month == 7 && date >= 23 ||
				this_month == 8 && date <= 22) {
			System.out.println("Знак: Лев");
		} else if (this_month == 8 && date >= 23 ||
				this_month == 9 && date <= 22) {
			System.out.println("Знак: Дева");
		} else if (this_month == 9 && date >= 23 ||
				this_month == 10 && date <= 22) {
			System.out.println("Знак: Весы");
		} else if (this_month == 10 && date >= 23 ||
				this_month == 11 && date <= 21) {
			System.out.println("Знак: Скорпион");
		} else if (this_month == 11 && date >= 22 ||
				this_month == 12 && date <= 21) {
			System.out.println("Знак: Стрелец");
		} else if (this_month == 12 && date >= 22 ||
				this_month == 1 && date <= 19) {
			System.out.println("Знак: Козерог");
		} else {
			System.out.println("Знак: Неверная дата!");
		}
	}
}
