package com.hjcom.break_continue;
// break문의 사용 예

public class F01 {
    public static void main(String[] args) {
        int n;

        for (n=1; n<=10; n++)   // 1부터 10까지 자연수를 구함
            System.out.print(" "+ n);

        System.out.println();

        for (n=1; n<=10; n++){  // 1부터 10까지 자연수를 구함
            if (n%3==0)     // 제어변수 n이 3으로 나누어떨어지면 반복문을 벗어남
                break;
            System.out.print(" "+ n);
        }
        System.out.println();
    }
}
