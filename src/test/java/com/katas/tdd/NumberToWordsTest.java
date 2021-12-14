package com.katas.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberToWordsTest {
    NumberToWords numberToWords;

    @BeforeEach
    public void init() {
        numberToWords = new NumberToWords();
    }

    @AfterEach
    public void destroy() {
        numberToWords = null;
    }

    @Test
    public void emptyInputNumber_ReturnsEmptyString() {
        assertEquals("", numberToWords.convertNumberToWords(null));
    }

    @Test
    public void singleDigitNumber_ReturnsWords() {
        assertEquals("zero", numberToWords.convertNumberToWords(0));
        assertEquals("one", numberToWords.convertNumberToWords(1));
        assertEquals("two", numberToWords.convertNumberToWords(2));
        assertEquals("three", numberToWords.convertNumberToWords(3));
        assertEquals("four", numberToWords.convertNumberToWords(4));
        assertEquals("five", numberToWords.convertNumberToWords(5));
        assertEquals("six", numberToWords.convertNumberToWords(6));
        assertEquals("seven", numberToWords.convertNumberToWords(7));
        assertEquals("eight", numberToWords.convertNumberToWords(8));
        assertEquals("nine", numberToWords.convertNumberToWords(9));
    }
}