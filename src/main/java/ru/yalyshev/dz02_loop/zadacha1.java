package ru.yalyshev.dz02_loop;

public class zadacha1 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		while (num3 <= 10_000_000) {
			System.out.println(num3 + "");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
