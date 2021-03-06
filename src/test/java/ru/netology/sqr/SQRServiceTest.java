package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources={"/data.csv"})

    public void test(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareCount(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
