package src.repetitiveStatement.practice12;

import java.util.Scanner;

// hasNextInt() 를 사용하여 종료 시점을 만들어주기
// 만약 입력값이 정수일 경우 true 를 반환하고 아닐경우 바로 예외를 던지며
// 더이상 입력을 받지 않고 false 를 반환하기 때문에 반복문이 종료됨

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
