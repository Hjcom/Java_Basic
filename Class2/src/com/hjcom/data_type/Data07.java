package com.hjcom.data_type;

// 문자 형태의 자료형 저장하기
public class Data07 {
    public static void main(String[] args){
        char x;
        x='A';
        System.out.printf("%c -> %d \n", x, (int)x);
        x='0';
        System.out.printf("%c -> %d \n", x, (int)x);
        x=0;    // 0은 NULL 문자를 의미
        System.out.printf("%c -> %d \n", x, (int)x);
        x='a';
        System.out.printf("%c -> %d \n", x, (int)x);
    }
}
