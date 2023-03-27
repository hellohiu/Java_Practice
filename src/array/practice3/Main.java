package src.array.practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arNum = new int[n];

        for(int i=0; i<arNum.length; i++){
            arNum[i] = sc.nextInt();
        }

        int min = arNum[0];
        int max = arNum[0];

        for(int i=0; i<arNum.length; i++){
            if(arNum[i]<min){
                min = arNum[i];
            }
            if(arNum[i]>max){
                max = arNum[i];
            }
        }

        System.out.print(min + " " + max);
    }
}
