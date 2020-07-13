package com.hjcom.condition;

import java.sql.SQLOutput;

// switch문으로 나라명 출력하기
public class Switch04 {
    public static void main(String[] args) {
        String str = args[0];
        char ch;
        ch = str.charAt(0);     // = 'b';

        switch(ch){
            case 'A':
            case 'a':
                System.out.println("America");
                break;
            case 'B':
            case 'b':
                System.out.println("Britain");
                break;
            case 'C':
            case 'c':
                System.out.println("Canada");
                break;
            case 'J':
            case 'j':
                System.out.println("Japan");
                break;
            case 'K':
            case 'k':
                System.out.println("Korea");
                break;
        }
    }
}
