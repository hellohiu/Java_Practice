package src.array.practice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arNum = new int[9];

        for(int i=0; i<arNum.length; i++){
            arNum[i] = sc.nextInt();
        }

        int max = arNum[0];
        int n = 1;

        for(int i=1; i<arNum.length; i++){
            if(max < arNum[i]){
                max = arNum[i];
                n = i+1;
            }
        }

        System.out.println(max);
        System.out.println(n);
    }
}
