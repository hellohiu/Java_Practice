package src.string.practice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int r;
        String str;
        String[] arStr = new String[t];
        for(int i=0; i<arStr.length; i++){
            r = sc.nextInt();
            str = sc.next();
            arStr[i] = "";
            for(int j=0; j<str.length(); j++){
                for(int k=0; k<r; k++){
                    arStr[i] += str.charAt(j);
                }
            }
        }

        for(int i=0; i<arStr.length; i++){
            System.out.println(arStr[i]);
        }
    }
}
