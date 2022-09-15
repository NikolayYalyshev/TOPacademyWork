package ru.yalyshev.dz02_loop;

import java.util.Scanner;

public class zadacha5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите чесло для проверки на полиндром: ");
		int inputNumber = scanner.nextInt();
		int a = inputNumber;
		int sum = 0;
		int lastDigit;
		while (a > 0) {
			//System.out.println("inputNumber"+a);
			lastDigit = a % 10;
			//System.out.println(lastDigit);
			sum = (sum * 10) + lastDigit;
			//System.out.println(sum);
			a = a / 10;
		}
		if (sum == inputNumber) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
}
