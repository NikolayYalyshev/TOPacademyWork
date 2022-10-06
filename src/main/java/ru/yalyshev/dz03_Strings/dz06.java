package ru.yalyshev.dz03_Strings;

public class dz06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 4; i <= 99994; i++) {
			String str = String.valueOf(i);
			if (str.indexOf('4')!=-1){
				sum++;
				System.out.println(str);
			} else if (str.indexOf('1')!=-1 & str.indexOf('1')+1 == str.indexOf('3')) {
				sum++;
				System.out.println(str);
			}
		}
		System.out.println("Нужно исключить "+sum+" номеров");
	}
}
