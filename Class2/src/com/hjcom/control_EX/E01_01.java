package com.hjcom.control_EX;
// for문 안에 if문 사용하기

public class E01_01 {
    public static void main(String[] args) {
        int n;      // 제어변수
        int odd_tot, even_tot;

        for (odd_tot=0, even_tot=0, n=1; n<=10; n++)
            if (n%2 == 1)   // 홀수일경우
                odd_tot += n;
            else            // 짝수일 경우
                even_tot += n;

        System.out.println(" odd_tot(1+3+5+7+9) = " + odd_tot);    // 홀수 합 출력
        System.out.println(" even_tot(2+4+6+8+10) = " + even_tot);  // 짝수 합 출력
    }
}
