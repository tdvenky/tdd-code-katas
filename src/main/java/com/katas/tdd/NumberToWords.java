package com.katas.tdd;

public class NumberToWords {

	public String convertNumberToWords(Integer number) {
        StringBuilder words = new StringBuilder();

        if(number == null) return words.toString();

        if(number == 0) {
            words.append("zero");
        } else if(number == 1) {
            words.append("one");
        }
		return words.toString();
	}
}