package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;
/*
 *  백준 1546번
 * 
 */
public class P002 {
    private static int[] A;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken(" "));
        }
        int sum = Arrays.stream(A).sum();
        OptionalInt max = Arrays.stream(A).max();
        System.out.println((float)(sum * 100) / (N * max.getAsInt()));
    }
}
