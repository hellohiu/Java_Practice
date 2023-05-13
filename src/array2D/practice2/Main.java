package src.array2D.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int n = 0;
        int m = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
