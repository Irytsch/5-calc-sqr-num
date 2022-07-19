package ru.netology.sqr.javaqa41mvn.services;

public class SQRService {

    public int calcSqrNum(int minRange, int maxRange) {

        int count = 0;


        for (int i = 10; i <= 99; i++) {
            if (minRange <= i * i && i * i <= maxRange) {
                count++;
            }
        }
        return count;
    }
}