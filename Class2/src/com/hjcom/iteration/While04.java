package com.hjcom.iteration;
// 1부터 10 사이의 짝수의 합 구하기
public class While04 {
    public static void main(String[] args) {
        int n;      // 제어변수 선언
        int tot=0;  // 합을 누적할 변수 선언

        n=0;
        while (n<=8){
            n += 2;         // 2씩 증가
            tot += n;       // 제어변수 n을 합을 누적할 변수에 더함
        }
        System.out.println("tot = " + tot);
    }
}
