package src.array2D.practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for(int i=0; i<5; i++){
            String str = sc.next();
            for(int j=0; j<15; j++){
                if(j<str.length()){
                    arr[i][j] = str.charAt(j);
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] == ' '){
                    continue;
                } else {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
