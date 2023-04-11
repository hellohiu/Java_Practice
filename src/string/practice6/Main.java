package src.string.practice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<26; i++){
        int x = -1;
            for(int j=0; j<str.length(); j++){
                if(i+97 == str.charAt(j)) {
                    x = j;
                    break;
                }
            }
            System.out.print(x + " ");
        }
    }
}
