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
    }
}