package src.math.practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A : 10 (65) , ... Z : 35
        String str = "";
        int num = 0;
        int count = 1;
        int total = 0;

        str = sc.next();
        num = sc.nextInt();

        for(int i=0; i<str.length(); i++){
            for(int j=1; j<str.length()-i; j++){
                count *= num;
            }

            if(str.charAt(i)-55 >= 10){
                total += (str.charAt(i)-55) * count;
            } else {
                total += (str.charAt(i)-48) * count;
            }

            count = 1;
        }
        
        System.out.println(total);
    }
}
