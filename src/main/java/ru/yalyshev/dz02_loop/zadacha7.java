package ru.yalyshev.dz02_loop;

public class zadacha7 {
	private static int number = 10;
	
	public static void main(String[] args) {
		int module = (int) Math.pow(2, 30);
		while (module > number) {
			module >>= 1;
		}
		System.out.print("Число " + number + " в битовом представлении: ");
		while (module > 0) {
			System.out.print(number / module > 0 ? 1 : 0);
			number %= module;
			module >>= 1;
		}
	}
}
