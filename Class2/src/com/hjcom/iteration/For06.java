package com.hjcom.iteration;
// 1부터 5까지 합 구하기
// n까지의 합 = n-1까지의 합 + n
public class For06 {
    public static void main(String[] args) {
        int i;              // 제어변수 선언
        int total = 0;      // 합을 누적할 변수 total을 선언하고 0으로 초기화

        for(i=1; i<=5; i++) { // 제어변수 i가 1부터 5까지 1씩 증가하도록 함
            total += i;
            System.out.println("1 ~ " + (i - 1) + " = " + total);
        }
    }
}
