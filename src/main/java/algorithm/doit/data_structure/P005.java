package algorithm.doit.data_structure;

import java.io.IOException;
import java.util.Scanner;

public class P005 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] S = new long[N];
        long[] C = new long[N];
        long answer = 0;
        S[0] = scanner.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int reminder = (int) (S[i] % M);
            if (reminder == 0) {
                answer++;
            }
            C[reminder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer += (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
