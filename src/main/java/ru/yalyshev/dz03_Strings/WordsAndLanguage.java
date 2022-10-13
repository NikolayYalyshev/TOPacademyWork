package ru.yalyshev.dz03_Strings;

import java.util.ArrayList;
import java.util.List;

public class WordsAndLanguage {
	public static final String LANG_CPP = "CPP";
	public static final String LANG_JAVA = "JAVA";
	public static final String LANG_NONE = "NONE";
	
	public String language;
	public List<String> words;
	
	public WordsAndLanguage(String language, List<String> words) {
		this.language = language;
		this.words = words;
	}
	
	public static WordsAndLanguage createNone() {
		return new WordsAndLanguage(LANG_NONE, new ArrayList<>());
	}
	
	@Override
	public String toString() {
		return "WordsAndLanguage{" + "language='" + language + '\'' +
				", words=" + words + '}';
	}
}
