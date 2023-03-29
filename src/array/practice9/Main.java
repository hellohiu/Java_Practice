package src.array.practice9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arNum = new int[n];
        int m = sc.nextInt();
        int temp, a, b;

        for(int i=0; i<arNum.length; i++){
            arNum[i] = i+1;
        }

        for(int i=0; i<m; i++){
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;

            int[] arNum2 = new int[b-a+1];
            for(int j=0; i<arNum2.length; j++){
                arNum2[j] = arNum[a+j];
            }

            Arrays.sort(arNum2);
            for(int j=0; i<arNum2.length; j++){
                arNum[a+j] = arNum2[j];
            }
        }

        for(int i=0; i<arNum.length; i++){
            System.out.print(arNum[i] + " ");
        }
    }
}
