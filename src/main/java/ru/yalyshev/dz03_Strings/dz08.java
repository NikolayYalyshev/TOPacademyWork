package ru.yalyshev.dz03_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dz08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Введите имя переменной(используйте латинские буквы):");
		String str = scanner.nextLine();
		WordsAndLanguage wordsAndLanguage = findWords(str);
		System.out.println(wordsAndLanguage);
		if (wordsAndLanguage.language.equals(WordsAndLanguage.LANG_CPP)){
			wordsAndLanguage.language = WordsAndLanguage.LANG_JAVA;
		} else if (wordsAndLanguage.language.equals(WordsAndLanguage.LANG_JAVA)){
			wordsAndLanguage.language = WordsAndLanguage.LANG_CPP;
		} else {
			System.out.println("ERROR");
			return;
		}
		System.out.println(generateName(wordsAndLanguage));
	}
	
	public static WordsAndLanguage findWords(String name) {
		char[] chars = name.toCharArray();
		String word = "";
		List<String> wordList = new ArrayList<>();
		String language = null;
		for (int i = 0; i < name.length(); i++) {
			char c = chars[i];
			if (i == 0 && !Character.isLowerCase(c)) {
				return WordsAndLanguage.createNone();
			}
			if (Character.isLowerCase(c)) {
				word += c;
			} else if (Character.isUpperCase(c)) {
				if (WordsAndLanguage.LANG_CPP.equals(language)) {
					return WordsAndLanguage.createNone();
				}
				language = WordsAndLanguage.LANG_JAVA;
				wordList.add(word);
				
				word = "" + Character.toLowerCase(c);
			} else if (c == '_') {
				if (WordsAndLanguage.LANG_JAVA.equals(language)) {
					return WordsAndLanguage.createNone();
				}
				language = WordsAndLanguage.LANG_CPP;
				wordList.add(word);
				
				word = "";
			}
		}
		if (word.length() > 0) {
			wordList.add(word);
		}
		return new WordsAndLanguage(language, wordList);
	}
	
	public static String generateName(WordsAndLanguage wordsAndLanguage) {
		if (wordsAndLanguage.language.equals(WordsAndLanguage.LANG_CPP)) {
			return String.join("_", wordsAndLanguage.words);
		} else if (wordsAndLanguage.language.equals(WordsAndLanguage.LANG_JAVA))
		{
			String name = "";
			for (int i = 0; i < wordsAndLanguage.words.size(); i++) {
				String word = wordsAndLanguage.words.get(i);
				if (i == 0) {
					name += word;
				} else {
					name += word.substring(0, 1).toUpperCase() +
							word.substring(1);
				}
			}
			return name;
		}
		return "";
	}
}


