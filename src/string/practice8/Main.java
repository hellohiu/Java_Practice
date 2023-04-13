package src.string.practice8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arStr = str.split(" ");

        System.out.println(arStr.length);
    }
}
