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

    @Test
    public void teenDigitNumber_ReturnsWords() {
        assertEquals("ten", numberToWords.convertNumberToWords(10));
        assertEquals("eleven", numberToWords.convertNumberToWords(11));
        assertEquals("twelve", numberToWords.convertNumberToWords(12));
        assertEquals("thirteen", numberToWords.convertNumberToWords(13));
        assertEquals("fourteen", numberToWords.convertNumberToWords(14));
        assertEquals("fifteen", numberToWords.convertNumberToWords(15));
        assertEquals("sixteen", numberToWords.convertNumberToWords(16));
        assertEquals("seventeen", numberToWords.convertNumberToWords(17));
        assertEquals("eighteen", numberToWords.convertNumberToWords(18));
        assertEquals("nineteen", numberToWords.convertNumberToWords(19));
    }

    @Test
    public void multiplesOfTenNumber_ReturnsWords() {
        assertEquals("twenty", numberToWords.convertNumberToWords(20));
        assertEquals("thirty", numberToWords.convertNumberToWords(30));
        assertEquals("fourty", numberToWords.convertNumberToWords(40));
        assertEquals("fifty", numberToWords.convertNumberToWords(50));
        assertEquals("sixty", numberToWords.convertNumberToWords(60));
        assertEquals("seventy", numberToWords.convertNumberToWords(70));
        assertEquals("eighty", numberToWords.convertNumberToWords(80));
        assertEquals("ninety", numberToWords.convertNumberToWords(90));
    }

    @Test
    public void twoDigitNumber_ReturnsWords() {
        assertEquals("twenty one", numberToWords.convertNumberToWords(21));
        assertEquals("thirty two", numberToWords.convertNumberToWords(32));
        assertEquals("fourty three", numberToWords.convertNumberToWords(43));
        assertEquals("fifty four", numberToWords.convertNumberToWords(54));
        assertEquals("sixty five", numberToWords.convertNumberToWords(65));
        assertEquals("seventy six", numberToWords.convertNumberToWords(76));
        assertEquals("eighty seven", numberToWords.convertNumberToWords(87));
        assertEquals("ninety eight", numberToWords.convertNumberToWords(98));
    }

    @Test
    public void threeDigitNumber_ReturnsWords() {
        assertEquals("one hundred", numberToWords.convertNumberToWords(100));
        assertEquals("two hundred", numberToWords.convertNumberToWords(200));
        assertEquals("four hundred", numberToWords.convertNumberToWords(400));
        assertEquals("six hundred", numberToWords.convertNumberToWords(600));
        assertEquals("nine hundred", numberToWords.convertNumberToWords(900));

        assertEquals("one hundred one", numberToWords.convertNumberToWords(101));
        assertEquals("six hundred seven", numberToWords.convertNumberToWords(607));

        assertEquals("four hundred sixty", numberToWords.convertNumberToWords(460));
        assertEquals("two hundred thirty", numberToWords.convertNumberToWords(230));

        assertEquals("eight hundred fourty three", numberToWords.convertNumberToWords(843));
        assertEquals("five hundred twenty one", numberToWords.convertNumberToWords(521));

        assertEquals("three hundred thirteen", numberToWords.convertNumberToWords(313));
        assertEquals("nine hundred nineteen", numberToWords.convertNumberToWords(919));
    }
}