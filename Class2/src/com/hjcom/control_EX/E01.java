package com.hjcom.control_EX;
// 1부터 10 사이의 짝수의 합과 홀수의 합 구하기
public class E01 {
    public static void main(String[] args) {
        int n;      // 제어변수
        int odd_tot, even_tot;

        for (odd_tot=0, n=1; n<=10; n += 2)     // 홀수 합 구하는 코드
            odd_tot += n;

        for (even_tot=0, n=2; n<=10; n += 2)    // 짝수 합 구하는 코드
            even_tot += n;

        System.out.println(" odd_tot(1+3+5+7+9) = " + odd_tot);    // 홀수 합 출력
        System.out.println(" even_tot(2+4+6+8+10) = " + even_tot);  // 짝수 합 출력
    }
}
