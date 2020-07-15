package com.hjcom.array;
// 1차원 배열에 초기 값을 지정하는 예

public class G02 {
    public static void main(String[] args) {
        // 각 달의 날짜수를 초기값으로 설정
        int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i=0; i<12; i++)    // 반복문으로 배열을 일괄 처리
            System.out.println( (i+1) + " month => "+ month[i]);
    }
}
