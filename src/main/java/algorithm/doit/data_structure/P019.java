package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.text.StyleContext.SmallAttributeSet;

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
		
		
	}
	
	public static void quickSort(int[] A, int S, int E, int K) {
		if (S < E) {
			int pivot = partition(A, S, E);
			if (pivot == K) {
				return;
			} else if (K < pivot) {
				quickSort(A, S, pivot - 1, K);
			} else {
				quickSort(A, pivot + 1, E, K);
			}
		}
	}
	
	public static int partition(int[] A, int S, int E) {
		int M = (S + E) / 2;
		swap(A, S, M);
		int pivot = A[S];
		int i = S, j = E;
		while (i < j) {
			while (pivot < A[j]) {
				j--;
			}
			while (i < j && pivot >= A[i]) {
				i++;
			}
			swap(A, i, j);
		}
		A[S] = A[i];
		A[i] = pivot;
		return i;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
