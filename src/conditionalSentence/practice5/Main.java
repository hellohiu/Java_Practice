package src.conditionalSentence.practice5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int t = h*60 + m - 45;

        if(t < 0){
            System.out.print((t+24*60)/60 + " ");
            System.out.print((t+24*60)%60);
        }else{
            System.out.print(t/60 + " ");
            System.out.print(t%60);
        }
    }
}
