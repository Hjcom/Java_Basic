// 조건 연산자를 이용해서 최대값 구하기
public class Opr03 {
    public static void main(String[] args){
        int a=5, b=10;
        int max=a;

        max = a>b ? a : b;
        System.out.println(" max = " + max);
    }
}
