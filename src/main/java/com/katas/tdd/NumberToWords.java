package com.katas.tdd;

import java.util.HashMap;

public class NumberToWords {
    private HashMap<Integer, String> singleDigitNumberToWords;
    private HashMap<Integer, String> teenDigitNumberToWords;
    private HashMap<Integer, String> multiplesOfTenNumberToWords;
    private HashMap<Integer, Integer> positionToPlace;

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

    private void initPositionToPlace() {
        positionToPlace = new HashMap<Integer,Integer>();

        positionToPlace.put(1, 1);  // Units place
        positionToPlace.put(2, 10); // Tens place
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
            if(number % 10 == 0) {
                initMultiplesOfTenNumberToWords();
                words.append(multiplesOfTenNumberToWords.get(number));
            } else {
                initMultiplesOfTenNumberToWords();
                initSingleDigitNumberToWords();
                initPositionToPlace();

                String stringNumber = Integer.toString(number);

                for(int idx = 0, position = stringNumber.length(); idx < stringNumber.length(); idx++, position--) {

                    int digit = Integer.parseInt(Character.toString(stringNumber.charAt(idx)));
                    digit = digit * positionToPlace.get(digit);

                    switch (position) {
                        case 2:
                            words.append(multiplesOfTenNumberToWords.get(digit) + " " );
                            break;
                        case 1:
                            words.append(singleDigitNumberToWords.get(digit));
                            break;
                    }
                }
            }
        }

        return words.toString().trim();
    }
}