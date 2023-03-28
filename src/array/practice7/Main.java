package src.array.practice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arNum = new int[30];
        int num;

        for(int i=0; i<28; i++){
            num = sc.nextInt();
            arNum[num-1] = 1;
        }

        for(int i=0; i<arNum.length; i++){
            if(arNum[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
