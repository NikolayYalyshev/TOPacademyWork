package ru.yalyshev.array_processor;


/**
 * 04-java-basic-array-processor
 * Useful methods for array processing
 */

public class ArrayProcessor {
	
	public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
		int maxNegativeI = -1;
		int maxNegative = Integer.MIN_VALUE; //минимально возможное число
		int minPositiveI = -1;
		int minPositive = Integer.MAX_VALUE;
		for (int i = 0; i < input.length; i++) {
			int value = input[i];
			if (value < 0 && value > maxNegative) {
				maxNegativeI = i;
				maxNegative = value;
			} else if (value > 0 && value < minPositive) {
				minPositiveI = i;
				minPositive = value;
			}
		}
		if (maxNegativeI == -1) {
			System.out.println("В массиве нет ни одного отрицательного числа");
			return input;
		}
		if (minPositiveI == -1) {
			System.out.println("В массиве нет ни одного положительного числа");
			return input;
		}
		return swap(input, maxNegativeI,minPositiveI);
		
	}
	
	private int[] swap(int[] input, int i1, int i2) {
		int value = input[i1]; //
		input[i1] = input[i2];
		input[i2] = value;
		return input;
	}
	
	public int countSumOfElementsOnEvenPositions(int[] input) {
		int arrOne = 18;
		int [] inputOne = new int[arrOne];
		for (int i=0; i<arrOne; i++){
			inputOne [i] = i;
		}
		int summ = 0;
		for (int i = 0; i<inputOne.length; i++){
			if (i%2 == 0){
				summ+=inputOne[i];
			}
		}
		System.out.println(summ);
		return summ;
	}
	
	public int[] replaceEachNegativeElementsWithZero(int[] input) {
		return null;
	}
	
	public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(
			int[] input) {
		return null;
	}
	
	public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
		return new Float(null);
	}
	
	
	public int[] findSameElementsStandingOnOddPositions(int[] input) {
		return null;
	}
	
}
