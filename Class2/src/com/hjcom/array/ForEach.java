package com.hjcom.array;
// for each문 예제

public class ForEach {
    public static void main(String[] args) {
        int[] englishscore = {80, 90, 30, 40, 60, 95, 76, 98, 100, 77};
        int sum = 0;
        double average = 0.0;

        // 배열의 크기만큼 자동으로 반복해줌
        for (int score : englishscore) {
            sum = sum + score;
        }
        System.out.println("총합 : " + sum);

        average = (double) sum / (double) englishscore.length; // .length (배열의 크기)
        System.out.println("평균 : " + average);
    }
}
