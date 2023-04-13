package src.string.practice9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().trim();
        String str2 = sc.next().trim();

        String[] arStr1 = str1.split("");
        String[] arStr2 = str2.split("");

        str1 = "";
        str2 = "";

        for(int i=arStr1.length-1; i>=0; i--){
            str1 += arStr1[i];
        }

        for(int i=arStr2.length-1; i>=0; i--){
            str2 += arStr2[i];
        }

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        }
    }
}
