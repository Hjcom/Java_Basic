package com.hjcom.condition;
// 학점 구하는 프로그램
public class If05 {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);  // score=85;

        System.out.print(score + "는 ");
        if (score >= 90 && score <= 100)
            System.out.println("A학점");
        else if(score >= 80 && score <= 89)
            System.out.println("B학점");
        else if(score >= 70 && score <= 79)
            System.out.println("C학점");
        else if(score >= 60 && score <= 69)
            System.out.println("D학점");
        else
            System.out.println("F학점");

    }
}
