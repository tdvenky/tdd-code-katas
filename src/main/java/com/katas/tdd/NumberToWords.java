package com.katas.tdd;

public class NumberToWords {

	public String convertNumberToWords(Integer number) {
        StringBuilder words = new StringBuilder();

        if(number == null) return words.toString();

        if(number == 0) {
            words.append("zero");
        }
		return words.toString();
	}
}