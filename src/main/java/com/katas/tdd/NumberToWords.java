package com.katas.tdd;

import java.util.HashMap;

public class NumberToWords {
    private HashMap<Integer, String> singleDigitNumberToWords;
    private HashMap<Integer, String> teenDigitNumberToWords;
    private HashMap<Integer, String> multiplesOfTenNumberToWords;
    private HashMap<Integer, String> placeToWords;

    public NumberToWords() {
        initSingleDigitNumberToWords();
        initTeenDigitNumberToWords();
        initMultiplesOfTenNumberToWords();
        initPlaceToWords();
    }

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
        multiplesOfTenNumberToWords.put(30, "thirty");
        multiplesOfTenNumberToWords.put(40, "fourty");
        multiplesOfTenNumberToWords.put(50, "fifty");
        multiplesOfTenNumberToWords.put(60, "sixty");
        multiplesOfTenNumberToWords.put(70, "seventy");
        multiplesOfTenNumberToWords.put(80, "eighty");
        multiplesOfTenNumberToWords.put(90, "ninety");
    }

    private void initPlaceToWords() {
        placeToWords = new HashMap<Integer,String>();

        placeToWords.put(3, "hundred");
        placeToWords.put(4, "thousand");
    }

    private String getWordsByNumberAndPosition(int number, int position) {
        return singleDigitNumberToWords.get(number) + " " + placeToWords.get(position) + " ";
    }

    private int charToInt(char c) {
        return Integer.parseInt(Character.toString(c) );
    }

    public String convertNumberToWords(Integer number) {
        StringBuilder words = new StringBuilder();

        if(number == null) return words.toString();

        if(number == 0) return words.append(singleDigitNumberToWords.get(0)).toString();

        String stringNumber = Integer.toString(number);

        for(int idx = 0, position = stringNumber.length(); idx < stringNumber.length(); idx++, position--) {

            int digit = charToInt(stringNumber.charAt(idx));

            if(digit == 0) continue;

            switch (position) {
                case 4: // Thousands place
                case 3: // Hundreds place
                    words.append(getWordsByNumberAndPosition(digit, position));
                    break;
                case 2: // Tens place
                    if(digit == 1)
                        words.append(teenDigitNumberToWords.get((digit*10) + charToInt(stringNumber.charAt(++idx))));
                    else
                        words.append(multiplesOfTenNumberToWords.get(digit*10) + " ");
                    break;
                case 1: // Units place
                    words.append(singleDigitNumberToWords.get(digit));
                    break;
            }
        }

        return words.toString().trim();
    }
}