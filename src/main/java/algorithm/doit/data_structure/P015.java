package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P015 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (A[j] > A[j + 1]) {
					swap(A, j);
				}				
			}
		}
		Arrays.stream(A).forEach(System.out::println);
	}
	public static void swap(int[] A, int j) {
		int tmp = A[j];
		A[j] = A[j + 1];
		A[j + 1] = tmp;
	}
}
