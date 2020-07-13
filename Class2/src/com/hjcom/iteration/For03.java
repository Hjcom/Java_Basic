package com.hjcom.iteration;
// for문의 다양한 활용
public class For03 {
    public static void main(String[] args) {
        int i;

        // i의 초기값을 1로 하려 1씩 증가하면서 10일 때까지 반복
        for(i=1; i<=10; i++)
            System.out.print(" " + i);

        System.out.print("\n");
        for(i=0; i<25; i++)
            System.out.print("-");
        System.out.println(" >>");

        // i의 초기값을 1로 하여 2씩 증가하면서 10일 때까지 반복하면 홀수가 출력된다.
        for (i=1; i<=10; i+=2)
            System.out.print(" " + i);

        System.out.print("\n");
        for(i=0; i<25; i++)
            System.out.print("-");
        System.out.println(" >>");

        // i의 초기값을 2로 하여 2씩 증가하면서 10일 때까지 반복하면 짝수를 출력한다.
        for(i=2; i<=10; i+=2)
            System.out.print(" " + i);

        System.out.print("\n");
        for(i=0; i<25; i++)
            System.out.print("-");
        System.out.println(" >>");

        // i의 초기값을 10으로 하여 1씩 감소하면서  1보다 크거나 같을 때까지 반복
        for(i=10; i>=1; i--)
            System.out.print(" " + i);

        System.out.print("\n");
        for(i=0; i<25; i++)
            System.out.print("-");
        System.out.println(" >>");
    }
}
