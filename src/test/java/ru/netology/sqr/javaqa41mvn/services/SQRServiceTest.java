package ru.netology.sqr.javaqa41mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrnum.csv")

    public void shouldCalcSqrNum(int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();

        int actual = service.calcSqrNum(minRange, maxRange);
        Assertions.assertEquals(expected, actual);
    }

    /*@ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/bonus.csv")
    public void shouldCalcSqrNumFrom500To3000() {
        SQRService service = new SQRService();

        int expected = 32;
        int actual = service.calcSqrNum(500, 3000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/bonus.csv")
    public void shouldCalcSqrNumFrom8000To10000() {
        SQRService service = new SQRService();

        int expected = 10;
        int actual = service.calcSqrNum(8000, 10000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/bonus.csv")
    public void shouldCalcSqrNumFrom100to10000() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrNum(100, 10000);
        Assertions.assertEquals(expected, actual);
    }*/
}
