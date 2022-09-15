package ru.yalyshev.dz01_foreach;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите номер квартиры: ");
		int N = scanner.nextInt();
		System.out.println("Введите количество квартир на этаже: ");
		int M = scanner.nextInt();
		int flatsOnFloor = M * 9; //количество квартир в подъезде
		int entrance = N / flatsOnFloor;
		if (N <= flatsOnFloor & N != 0) {
			System.out.println("1 подъезд");
		} else if (entrance >= 0 & entrance < flatsOnFloor) {
			entrance = entrance + 1;
			System.out.println(entrance + " подъезд");
		}
	}
}
