package src.repetitiveStatement.practice11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while(isTrue){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){
                isTrue = false;
            }else{
                System.out.println(a + b);
            }
        }
    }
}
