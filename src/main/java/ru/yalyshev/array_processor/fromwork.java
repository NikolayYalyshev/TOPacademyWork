package ru.yalyshev.array_processor;

import java.nio.charset.StandardCharsets;
import java.util.*;

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
		
		int[] numbers = new int[]{3, 2, 1};
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		int[] numbers1 = new int[]{5, 4, 3, 2, 1};
		for (int number : numbers1) {
			number = 5;
		}
		System.out.println(Arrays.toString(numbers1));
		
		int[] src = new int[]{1, 2, 3, 4, 5};
		int[] dest = new int[]{5, 4, 3, 2, 1};
		int length = 3;
		int srcIndex = 1;
		int destIndex = 2;
		System.arraycopy(src, srcIndex, dest, destIndex, length);
		System.out.println(Arrays.toString(dest));
		
		int[] mus = new int[]{1, 2, 3};
		String content = Arrays.toString(mus);
		System.out.print(content);
		
		String[][] objects = new String[3][3];
		objects[1][1] = new String("Hello");
		String content1 = Arrays.deepToString(objects);
		System.out.println(content1);
		
		boolean[] test1 = new boolean[3];
		Arrays.fill(test1, true);
		System.out.println(Arrays.toString(test1));
		
		int[] masiv = new int[10];
		int startIndex = 1;
		int endIndex = 4;
		Arrays.fill(masiv, startIndex, endIndex, 2);
		System.out.println(Arrays.toString(masiv));
		
		int[] masiv1 = new int[]{1, 12, 5, 98, 47, 56, 14, 88};
		Arrays.sort(masiv1);
		System.out.println(Arrays.toString(masiv1));
		
		Integer[] masiv2 = new Integer[]{33, 15, 99, 38, 7};
		Arrays.sort(masiv2, Collections.reverseOrder());
		System.out.println(Arrays.toString(masiv2));
		
		int[] mas5 = new int[]{1, 2, 3, 4};
		int[] mas6 = new int[]{1, 2, 3};
		boolean isEqual = Arrays.equals(mas5, mas6);
		System.out.println(isEqual);
		
		int index = Arrays.binarySearch(mas6, 0);
		System.out.println(index);
		
		Integer v = Arrays.deepHashCode(objects);
		System.out.println(v);
		
		String name = "Vasya";
		System.out.println(name);
		
		String name1 = new String("Vasya");
		System.out.println(name1);
		
		String name2 = "Kolya";
		String name3 = "Kolya";
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		String value = String.valueOf(3);
		value = String.valueOf(0.5);
		value = String.valueOf(true);
		System.out.println(value);
		
		System.out.format("Жили у бабуси %d веселых гуся", 2);
		System.out.print("\n");
		System.out.println("\\");
		
		String text1 = new String("Hello");
		System.out.println(text1.charAt(2));
		
		String firstName = "Ivan";
		String secondName = "Ivanov";
		System.out.println(secondName.length());
		System.out.println(firstName.isEmpty());
		
		String testString = "text";
		char myChar = testString.charAt(3);
		System.out.println(myChar);
		
		String testString1 = "testing";
		boolean test = testString1.contains("st");
		System.out.println(test);
		
		String str1 = "Star Wars";
		boolean povtor = str1.startsWith("Star");
		System.out.println(povtor);
		
		String str2 = "text.txt";
		boolean povtor2 = str2.endsWith(".txt");
		System.out.println(povtor2);
		
		String str3 = "   Я люблю Лену! А она любит меня.     ";
		System.out.println(str3.trim());
		
		String str4 = "Я люблю Лену! А она любит меня.";
		System.out.println(str4.toLowerCase());
		
		String str5 = "Я люблю Лену! А она любит меня.";
		System.out.println(str5.toUpperCase());
		
		String text2 = "Любвиобильность";
		int loveStore = text2.indexOf('б');
		System.out.println(loveStore);
		int loveStore1 = text2.indexOf('и', index + 6);
		System.out.println(loveStore1);
		
		int index2 = "last.index".lastIndexOf('.');
		System.out.println(index2);
		
		String world = "Hello world".substring(6);
		System.out.println(world);
		
		String world1 = "Hello world".substring(1, 4);
		System.out.println(world1);
		
		String replace = "Hello world";
		String startReplace = replace.replace('l', 'o');
		System.out.println(startReplace);
		
		String v1 = "Kolya";
		System.out.println(v1.getBytes());
		
		StringBuffer sb = new StringBuffer("test");
		sb.append('-').append("test").append(true).append(1);
		System.out.println(sb);
		
		StringBuffer sd = new StringBuffer("I Java");
		sd.insert(2, "love ");
		System.out.println(sd.toString());
		
		StringBuffer ds = new StringBuffer("palindrome");
		System.out.println(ds.reverse());
		
		StringBuffer phrases = new StringBuffer("I do not like Java!");
		phrases.delete(1, 7);
		phrases.deleteCharAt(1);
		phrases.replace(2, 3, "do l");
		System.out.println(phrases);
		
		String s = "Best Java programming language.";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String e = "Best,Java,programming,language.";
		StringTokenizer et = new StringTokenizer(e, ",");
		while (et.hasMoreTokens()) {
			System.out.println(et.nextToken());
		}
		System.out.println(" ");
		
		String t = "t";
		String cat1 = "ca" + t;
		String cat2 = "cat"; // в резутате конкатинации, строки не помещаются
		// в пул строк.
		System.out.println("в резутате конкатинации, строки не помещаются в " +
				"пул строк.");
		System.out.println(cat1 == cat2);
		System.out.println(" ");
		
		String text = "sum = " + 1 + 2;
		//В случае конкатенации строк оператором + с другими
		//примитивными типами данных, все последующие типы
		//преобразуются в строчное представление. В связи с этим
		//можно получить не то, что ожидается
		System.out.println(text);
		System.out.println(
				"Ошибки конкатинации, переменные переобраовались " + "в" +
						" строчное значение");
		System.out.println(" ");
		
		String text3 = "sum = " + (1 + 2);
		System.out.println(text3);
		System.out.println("переменные сложились, а после переобразовались в" +
				" " +
				"строчное значение");
		System.out.println(" ");
		
		String text4 = 1 + 2 + " = 3";
		System.out.println(text4);
		System.out.println("переменные сложились вначале строки и " +
				"переобразовались в строку");
		System.out.println(" ");
		
		String text5 = "mul = " + 2 * 3;
		System.out.println(text5);
		System.out.println("переменные вначале перемножились, а после " +
				"переобразовались");
		System.out.println(" ");
		
		String srav1 = "Java";
		String srav2 = "Java";
		System.out.println(srav1==srav2);
		System.out.println(srav1.equals(srav2));
		System.out.println(" ");
		
		String srav3 = new String("Java");
		String srav4 = new String("Java");
		System.out.println(srav3==srav4);
		System.out.println(srav3.equals(srav4));
		System.out.println(" ");
		
		String srav5 = new String("Java");
		srav5 = srav5.intern();
		String srav6 = new String("Java");
		srav6 = srav6.intern();
		System.out.println(srav5==srav6);
		System.out.println(srav5.equals(srav6));
		System.out.println(" ");
		
		String textA = "I like coffee";
		textA = textA.replaceAll("[Cc]offee", "Java");
		System.out.println(textA);
		
	}
}
