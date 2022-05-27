package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P005_MySolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] B = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            B[i] = B[i - 1] + Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if ((B[i] - B[j - 1]) % M == 0) count++;
            }
        }
        System.out.println(count);
    }
}
