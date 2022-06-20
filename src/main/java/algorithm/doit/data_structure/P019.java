package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P019 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.stream(A).forEach(System.out::print);
		
		int tmp = A[K];
		A[K] = A[1];
		A[1] = tmp;
		
		int start = 1;
		int end = N;
		
	}
}
