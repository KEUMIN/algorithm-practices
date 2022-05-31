package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class P008_MySolution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        long[] A = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            long sum = 0;

            while (start < end) {
                sum = A[start] + A[end];
                if (sum == A[i]) {
                    count++;
                    end--;
                } else if (sum < A[i]) {
                    start++;
                } else {
                    end--;
                }

            }
        }
        System.out.println(count);
    }
}

