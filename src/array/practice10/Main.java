package src.array.practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arScore = new int[n];

        for(int i=0; i<arScore.length; i++){
            arScore[i] = sc.nextInt();
        }

        int max = -1;
        double sum = 0.0;
        for(int i=0; i<arScore.length; i++){
            if(arScore[i]>max){ max = arScore[i]; }
        }

        for(int i=0; i<arScore.length; i++){
            sum += arScore[i]*100.0/max;
        }

        System.out.printf("%f", sum/arScore.length);
    }
}
