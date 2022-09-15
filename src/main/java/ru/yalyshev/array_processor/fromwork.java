package ru.yalyshev.array_processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fromwork {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(1);
		lists.add(3);
		for (Integer value : lists) {
			System.out.println(value);
		}
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			if (i >= 2) {
				break;
			}
			i++;
		}
				
				two:
		for (int n = 0; n < 10; n++) {
			for (int k = 10; k > 0; k--) {
				System.out.println(k + n + " ");
				if (k + n == 5 && n > 0) {
					break two;
				}
			}
		}
		
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.print(a);
		}
				
				one:
		for (int q = 0; q < 10; q++) {
			for (int w = 0; w < 10; w++) {
				if (q == w) {
					continue one;
				}
				System.out.printf("q=%d w=%d \n", q, w);
			}
		}
		
		int[] mas = new int[10];
		System.out.println(mas[1]);
		
		int[] mas1 = new int[]{3, 2, 1};
		System.out.println(mas1[1]);
		
		int[] mas2 = {3, 7, 4, 76, 88};
		System.out.println(mas2.length);
		
		int[][] mas3 = new int[5][5];
		mas3[2][1] = 3;
		System.out.println(mas3[2][1]);
		
		int[][] mas4 = new int[3][];
		mas4[0] = new int[4];
		mas4[1] = new int[]{2, 9};
		mas4[2] = new int[3];
		System.out.println(mas4[1][1]);
		
		int [] numbers = new int []{3,2,1};
		for (int number : numbers){
			System.out.print(number+" ");
		}
		
		int [] numbers1 = new int [] {5,4,3,2,1};
		for (int number : numbers1){
			number=5;
		}
		System.out.println(Arrays.toString(numbers1));
		
		int [] src = new int []{1,2,3,4,5};
		int [] dest = new int []{5,4,3,2,1};
		int length = 3;
		int srcIndex = 1;
		int destIndex = 2;
		System.arraycopy(src, srcIndex, dest, destIndex, length);
		System.out.println(Arrays.toString(dest));
		
		int [] mus = new int []{1,2,3};
		String content = Arrays.toString(mus);
		System.out.print(content);
		
		String [][] objects = new String[3][3];
		String content1 = Arrays.deepToString(objects);
		
	}
}
