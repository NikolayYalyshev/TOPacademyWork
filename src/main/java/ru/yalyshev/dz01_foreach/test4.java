package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите координату в плоскости X:");
		int x = scanner.nextInt();
		System.out.println("Введите координату в плоскости Y:");
		int y = scanner.nextInt();
		if (x>0 & y>0){
			System.out.println("Точка находится в I четверти.");
		} else if (x<0 & y>0){
			System.out.println("Точка находится во II четверти.");
		} else if (x<0 & y<0) {
			System.out.println("Точка находится в III четверти.");
		} else {
			System.out.println("Точка находится в IV четверти.");
		}
	}
}
