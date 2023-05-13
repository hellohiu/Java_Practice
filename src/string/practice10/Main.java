package src.string.practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arChar = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            arChar[i] = str.charAt(i);
        }

        // A=65
        int sum = 0;
        for(int i=0; i<arChar.length; i++){
            if(arChar[i] < 83){
                sum += (arChar[i]-65)/3 + 3;
            } else if(arChar[i] < 90) {
                sum += (arChar[i]-66)/3 + 3;
            } else {
                sum += (arChar[i]-67)/3 + 3;
            }
        }
        System.out.println(sum);
    }
}
