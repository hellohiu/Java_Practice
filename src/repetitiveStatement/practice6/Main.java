package src.repetitiveStatement.practice6;

import java.io.*;
import java.util.StringTokenizer;

// BufferedReader 와 BufferedWriter 사용하기
// BufferedWriter.flush 는 마지막에 한 번만 하면 됨
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.close();
    }
}
