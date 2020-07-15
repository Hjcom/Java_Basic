package com.hjcom.break_continue;
// 1부터 10 사이의 정수 중 3의 배수만 제외하고 출력하기

public class F03 {
    public static void main(String[] args) {
        int n;

        for (n=1; n<=10; n++){      // 1부터 10까지 자연수를 구함
            if (n%3 == 0)       // 3의 배수일 경우
                continue;       // 증감식으로 제어가 옮겨짐
            System.out.print(" "+n);
        }
        System.out.println();
    }
}
