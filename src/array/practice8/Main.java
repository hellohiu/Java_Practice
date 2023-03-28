package src.array.practice8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arNum = new int[10];

        for(int i=0; i<10; i++){
            arNum[i] = sc.nextInt() % 42;
        }

        // 작은 순으로 정렬
        Arrays.sort(arNum);

        int num = arNum[0];
        int cnt = 1;
        for(int i=1; i<10; i++){
            if(arNum[i] != num){
                num = arNum[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
