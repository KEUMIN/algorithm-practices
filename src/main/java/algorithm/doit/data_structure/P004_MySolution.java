package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P004_MySolution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[][] A = new long[N + 1][N + 1];
        long[][] B = new long[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /*
         *  부분합 2차 배열 풀이
         *  굳이 케이스 나눌 필요 없이
         *  가장 마지막 수식만 사용하면 되었음.
         */
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (i == 1 && j == 1) {
                    B[i][j] = A[i][j];
                } else if (i == 1 && j != 1) {
                    B[i][j] = B[i][j - 1] + A[i][j];

                } else if (j == 1 && i != 1) {
                    B[i][j] = B[i - 1][j] + A[i][j];

                } else {
                    B[i][j] = B[i - 1][j] + B[i][j -1] - B[i - 1][j - 1] + A[i][j];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            System.out.println(B[c][d] - (B[a - 1][d] + B[c][b - 1]) + B[a - 1][b - 1]);
        }

    }
}
