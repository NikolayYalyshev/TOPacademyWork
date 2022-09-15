package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Необходимо решить квадратное уравнение вида:");
		System.out.println("ax^2+bx+c=0");
		System.out.println("Введите значения a, b, c");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double D = b * b - 4 * a * c;
		if (D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("Корни уравнения x1 = " + x1 + ", x2 = " + x2);
		} else if (D == 0) {
			double x;
			x = -b / (2 * a);
			System.out.println("Корень уровнения x = " + x);
		} else {
			System.out.println("Корней нет");
		}
	}
}
