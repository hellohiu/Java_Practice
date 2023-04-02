package src.string.practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str;

        for(int i=0; i<n; i++){
            str = sc.nextLine();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length()-1));
            System.out.println();
        }
    }
}
