package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinaryNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[][] pinary = new long[num + 1][2];
        pinary[1][0] = 0;
        pinary[1][1] = 1;
        for (int i = 2; i <= num; i++) {
            pinary[i][0] = pinary[i - 1][0] + pinary[i - 1][1];
            pinary[i][1] = pinary[i - 1][0];
        }
        System.out.println(pinary[num][0] + pinary[num][1]);
    }
}
