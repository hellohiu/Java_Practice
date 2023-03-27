package src.array.practice5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a, b, c;
        int[] arNum = new int[n];
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for(int j=a-1; j<b; j++){
                arNum[j] = c;
            }
        }

        for(int i=0; i<arNum.length; i++){
            System.out.print(arNum[i] + " ");
        }
    }
}
