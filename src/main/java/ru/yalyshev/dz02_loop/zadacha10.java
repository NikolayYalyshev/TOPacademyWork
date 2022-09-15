package ru.yalyshev.dz02_loop;

public class zadacha10 {
	public static void main(String[] args) {
		for (int i = 1; i < 1_000_000_000; i++) {
			boolean success = true;
			for (int j = 20; j >= 2; j--) {
				if (i % j != 0) {
					success = false;
					break;
				}
			}
			if (success) {
				System.out.println(i);
			}
		}
	}
}