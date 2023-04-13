package src.string.practice8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] arStr = str.split(" ");

        if(str.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(arStr.length);
        }
    }
}
