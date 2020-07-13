package com.hjcom.iteration;
// 입력받은 문자를 입력받은 숫자만큼 반복해서 출력하기

public class For05{
    public static void main(String[] args) {
        int i;          // 제어변수
        int repeat;    // 반복 횟수를 결정할 변수
        String outStr=args[0];

        repeat = Integer.parseInt(args[1]);

        for(i=1; i<=repeat; i++)
            System.out.print(" " + outStr);
        System.out.print("\n");
    }
}
