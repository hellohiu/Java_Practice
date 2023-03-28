package src.array.practice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arNum = new int[n];
        for(int i=0; i<arNum.length; i++){
            arNum[i] = i+1;
        }

        int a, b, temp;
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            temp = arNum[a-1];
            arNum[a-1] = arNum[b-1];
            arNum[b-1] = temp;
        }

        for(int i=0; i<arNum.length; i++){
            System.out.print(arNum[i] + " ");
        }
    }
}
