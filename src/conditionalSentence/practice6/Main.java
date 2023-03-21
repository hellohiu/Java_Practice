package src.conditionalSentence.practice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int t = a*60 + b + c;

        if(t>=60*24){
            System.out.print((t-60*24)/60 + " ");
            System.out.print((t-60*24)%60);
        }else{
            System.out.print(t/60 + " ");
            System.out.print(t%60);
        }
    }
}
