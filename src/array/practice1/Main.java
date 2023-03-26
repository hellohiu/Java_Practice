package src.array.practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arNum = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arNum[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        for(int i=0; i<arNum.length; i++){
            if(arNum[i] == v){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
