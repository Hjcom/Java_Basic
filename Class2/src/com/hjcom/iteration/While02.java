package com.hjcom.iteration;
// 다양한 while문 살펴보기
public class While02 {
    public static void main(String[] args) {
        int i=1;

        while(i++ <= 4)
            System.out.print( i + ", ");

        System.out.print("\n");
        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

        i=1;
        while(++i <= 4)
            System.out.print( i + ", ");

        System.out.print("\n");
        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

        i=0;
        while(i++ <= 4)
            System.out.print( i + ", ");

        System.out.print("\n");
        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println(" >>");

    }
}
