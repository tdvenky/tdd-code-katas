package com.katas.tdd;

import java.util.HashMap;

public class NumberToWords {
    private HashMap<Integer, String> singleDigitNumberToWords;
    private HashMap<Integer, String> teenDigitNumberToWords;
    private HashMap<Integer, String> multiplesOfTenNumberToWords;

    private void initSingleDigitNumberToWords() {
        singleDigitNumberToWords = new HashMap<Integer,String>();

        singleDigitNumberToWords.put(0, "zero");
        singleDigitNumberToWords.put(1, "one");
        singleDigitNumberToWords.put(2, "two");
        singleDigitNumberToWords.put(3, "three");
        singleDigitNumberToWords.put(4, "four");
        singleDigitNumberToWords.put(5, "five");
        singleDigitNumberToWords.put(6, "six");
        singleDigitNumberToWords.put(7, "seven");
        singleDigitNumberToWords.put(8, "eight");
        singleDigitNumberToWords.put(9, "nine");
    }

    private void initTeenDigitNumberToWords() {
        teenDigitNumberToWords = new HashMap<Integer,String>();

        teenDigitNumberToWords.put(10, "ten");
        teenDigitNumberToWords.put(11, "eleven");
        teenDigitNumberToWords.put(12, "twelve");
        teenDigitNumberToWords.put(13, "thirteen");
        teenDigitNumberToWords.put(14, "fourteen");
        teenDigitNumberToWords.put(15, "fifteen");
        teenDigitNumberToWords.put(16, "sixteen");
        teenDigitNumberToWords.put(17, "seventeen");
        teenDigitNumberToWords.put(18, "eighteen");
        teenDigitNumberToWords.put(19, "nineteen");
    }

    private void initMultiplesOfTenNumberToWords() {
        multiplesOfTenNumberToWords = new HashMap<Integer,String>();

        multiplesOfTenNumberToWords.put(20, "twenty");
    }

    public String convertNumberToWords(Integer number) {
        StringBuilder words = new StringBuilder();

        if(number == null) return words.toString();

        if( number < 10) {
            initSingleDigitNumberToWords();
            words.append(singleDigitNumberToWords.get(number));
        } else if(number < 20) {
            initTeenDigitNumberToWords();
            words.append(teenDigitNumberToWords.get(number));
        } else {
            initMultiplesOfTenNumberToWords();
            words.append(multiplesOfTenNumberToWords.get(number));
        }

        return words.toString();
    }
}