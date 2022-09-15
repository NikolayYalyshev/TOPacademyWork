package ru.yalyshev.dz02_loop;

public class zadacha8 {
	public static void main(String[] args) {
		int combination = 0;
		for (int hour = 0; hour <= 23; hour++) {
			for (int min = 0; min <= 59; min++) {
				if (hour / 10 == min % 10 && hour % 10 == min / 10) {
					combination++;
					System.out.println(hour+" "+min);
				}
			}
		}
		System.out.println(combination);
	}
}
