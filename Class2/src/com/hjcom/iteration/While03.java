package com.hjcom.iteration;
// 다양한 반복문과 NULL문에 주의

public class While03 {
    public static void main(String[] args) {
        int i = 0;

        while (i++ <= 4)
            System.out.print(i + ", ");
        System.out.print("\n");

        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

        i = 1;
        do
            System.out.print(i + ", ");
        while(i++ <= 4);    // do while문은 반드시 세미콜론으로 끝난다.

        System.out.print("\n");

        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

        i = 0;
        while (i++ <= 4) ;      // null 문으로 인식함
            System.out.print( i + ", ");

        System.out.print("\n");

        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

        for (i=1; i<=4; i++) ;      // null 문으로 인식함
            System.out.print(i + ", ");

        System.out.print("\n");

        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");
    }
}
