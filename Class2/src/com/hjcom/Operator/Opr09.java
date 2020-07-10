package com.hjcom.Operator;

// 비트 단위 논리 연산자
public class Opr09 {
    public static void main(String[] args) {
        int a=12;       // 8+4 = 1100
        int b=20;       // 16+4 = 10100
        int c;

        c = a & b;      // 비트 단위 값이 둘 다 1일 때만 1 (AND 연산)
        System.out.println(a + " & " + b + " -> "+ c);

        c = a | b;      // 비트 단위 값이 둘 다 0일 때만 0 (OR 연산)
        System.out.println(a + " | " + b + " -> "+ c);

        c = a ^ b;      // 비트 단위 두 값이 다르면 1, 값으면 0 (XOR 연산)
        System.out.println(a + " ^ " + b + " -> "+ c);

        c = ~a;         // 비트 단위 값이 1이면 0으로 0이면 1로 (NOT 연산)
        System.out.println("~" + a +" -> " + c);
    }
}
