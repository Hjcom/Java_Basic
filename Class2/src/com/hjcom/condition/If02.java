package com.hjcom.condition;
// 홀수인지 짝수인지 판별하기
public class If02 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);    // num =40;

        if (num%2==1)   // 정수형 수치 데이터를 2로 나누어서 나머지가 1이면
            System.out.println(num+ "는 홀수입니다.");
        else
            System.out.println(num+ "는 짝수입니다.");
    }
}
