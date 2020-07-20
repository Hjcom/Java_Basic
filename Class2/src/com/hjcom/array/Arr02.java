package com.hjcom.array;
// 5개의 실수값 중에서 최대 값을 구하기

public class Arr02 {
    public static void main(String[] args) {
        double []data = {9.5, 7.0, 13.6, 7.5, 10.0};
        double max;
        // 반복문을 수행하기 전에 첫 번째 (첨자가 0인) 데이터를 최대값으로 설정

        max = data[0];

        for(int i=1; i<5; i++)
            if (data[i] > max)      // 배열의 원소가 최대값보다 크면
                max = data[i];      // 새로운 최대값으로 설정

        System.out.println(" max = " + max);    // 최대값 출력
    }
}
