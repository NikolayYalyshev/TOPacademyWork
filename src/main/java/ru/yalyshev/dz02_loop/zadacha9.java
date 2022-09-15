package ru.yalyshev.dz02_loop;

public class zadacha9 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1_000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum + " ");
	}
}
