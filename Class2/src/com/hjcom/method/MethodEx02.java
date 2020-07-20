package com.hjcom.method;
// 주어진 값까지의 자연수 합을 구하기

public class MethodEx02 {
    static void sum(int n){
        int i;
        int tot=0;

        for (i=1; i<=n; i++)        // 1부터 n까지의 자연수의 합 연산
            tot += i;

        System.out.println("1 ~ " + n + " = " + tot);
    }

    public static void main(String[] args) {
        sum(5);
        sum(10);
    }
}
