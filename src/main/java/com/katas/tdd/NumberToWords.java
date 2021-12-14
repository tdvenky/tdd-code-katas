package com.katas.tdd;

import java.util.HashMap;

public class NumberToWords {
    private HashMap<Integer, String> singleDigitNumberToWords;

    private void initSingleDigitNumberToWords() {
        singleDigitNumberToWords = new HashMap<Integer,String>();

        singleDigitNumberToWords.put(0, "zero");
        singleDigitNumberToWords.put(1, "one");
    }

	public String convertNumberToWords(Integer number) {
        StringBuilder words = new StringBuilder();

        if(number == null) return words.toString();

        initSingleDigitNumberToWords();

        words.append(singleDigitNumberToWords.get(number));

		return words.toString();
	}
}