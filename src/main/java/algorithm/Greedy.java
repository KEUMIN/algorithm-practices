package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("-");
        int sum = 0;
        for (int i = 0; i < S.length; i++) {
            if (i == 0) {
                sum += myNum(S[i]);
            } else {
                sum -= myNum(S[i]);
            }
        }
        System.out.println(sum);
    }
    static int myNum(String a) {
        return Arrays.stream(a.split("\\+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
    }
}
