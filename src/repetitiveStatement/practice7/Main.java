package src.repetitiveStatement.practice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            System.out.print("Case #" + (i+1) + ": ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
