package src.array2D.practice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr1 = new int[100][100];

        int x=0;
        while(x<num){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=n; i<n+10; i++){
                for(int j=m; j<m+10; j++){
                    arr1[i-1][j-1] = 1;
                }
            }
            x++;
        }

        int sum = 0;
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                sum += arr1[i][j];
            }
        }

        System.out.println(sum);
    }
}
