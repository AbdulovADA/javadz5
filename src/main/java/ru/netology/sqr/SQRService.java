package ru.netology.sqr;

public class SQRService {
    public int squareCount(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i) > min) {
                if ((i * i) < max) {
                    count++;
                }
            }
        }
        return count;

    }
}