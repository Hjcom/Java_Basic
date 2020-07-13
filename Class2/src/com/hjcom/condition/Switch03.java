package com.hjcom.condition;
// switch문으로 학점 구하기
public class Switch03 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println(" => " + args[0]);
        a=a/10;         // 점수를 입력받아 그 점수를 10으로 나누어 몫을 구한다.
        switch (a){     // 구해진 몫이 무엇이냐에 따라 학점을 출력한다.
            case 10:
            case 9:
                System.out.println(" A "); break;
            case 8:
                System.out.println(" B "); break;
            case 7:
                System.out.println(" C "); break;
            case 6:
                System.out.println(" D "); break;
            default:
                System.out.println(" F ");
        }
    }
}
