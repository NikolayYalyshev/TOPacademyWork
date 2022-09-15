package ru.yalyshev.dz02_loop;

import java.util.Scanner;

public class zadacha12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сколько километров пробежал спортсмен:");
		float xKm = scanner.nextFloat();
		System.out.println("Введите число километров, необходимое спортсмену " +
				"для преодоления: ");
		float yKm = scanner.nextFloat();
		double sum = 0;
		int day = 0;
		while (sum < yKm) {
			sum += xKm;
			xKm *= 1.1;
			day++;
		}
		System.out.println(day + " дней до преодоления необходимых километров");
	}
}
