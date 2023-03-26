package src.array.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arNum = new int[n];

        for(int i=0; i<arNum.length; i++){
            arNum[i] = sc.nextInt();
        }

        for(int i=0; i<arNum.length; i++){
            if(arNum[i] < x){
                System.out.print(arNum[i] + " ");
            }
        }
    }
}
