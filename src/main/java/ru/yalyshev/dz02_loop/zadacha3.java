package ru.yalyshev.dz02_loop;

public class zadacha3 {
	public static void main(String[] args) {
		int digit, sumCubeDigit = 0, tempNumber, input;
		for (input = 0; input < 1_000_000; input++) {
			tempNumber = input;
			sumCubeDigit = 0;
			if (input >= 0 & input <= 1_000) {
				while (tempNumber != 0) {
					digit = tempNumber % 10;
					sumCubeDigit = sumCubeDigit + digit * digit * digit;
					tempNumber = tempNumber / 10;
				}
				if (sumCubeDigit == input) {
					System.out.println(input + " - это число Армстронга");
				}
			}
			if (input > 1_000 & input <= 10_000) {
				while (tempNumber != 0) {
					digit = tempNumber % 10;
					sumCubeDigit =
							sumCubeDigit + digit * digit * digit * digit;
					tempNumber = tempNumber / 10;
				}
				if (sumCubeDigit == input) {
					System.out.println(input + " - это число Армстронга");
				}
			}
			if (input > 10_000 & input <= 100_000) {
				while (tempNumber != 0) {
					digit = tempNumber % 10;
					sumCubeDigit = sumCubeDigit +
							digit * digit * digit * digit * digit;
					tempNumber = tempNumber / 10;
				}
				if (sumCubeDigit == input) {
					System.out.println(input + " - это число Армстронга");
				}
			}
			if (input > 100_000) {
				while (tempNumber != 0) {
					digit = tempNumber % 10;
					sumCubeDigit = sumCubeDigit +
							digit * digit * digit * digit * digit * digit;
					tempNumber = tempNumber / 10;
				}
				if (sumCubeDigit == input) {
					System.out.println(input + " - это число Армстронга");
				}
			}
		}
	}
}
