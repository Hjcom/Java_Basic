package com.hjcom.iteration;
// n! = (n-1)! * n;
// 팩토리얼 구하기
public class For07 {
    public static void main(String[] args) {
        int i;      // 제어변수
        int n;
        int fac = 1;    // 팩토리얼을 누적할 변수, 선언 시 초기값 1

        n = Integer.parseInt(args[0]);  // 키보드에서 5를 입력받았다면

        for (i=1; i<=n; i++)
            fac *= i;   // fac = fac * i;
        System.out.println( n + "! ---- >> "+ fac);
    }
}
