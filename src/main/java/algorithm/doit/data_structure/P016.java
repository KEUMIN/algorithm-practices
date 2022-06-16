package algorithm.doit.data_structure;

import java.util.Scanner;

public class P016 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int[] A = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			A[i] = scanner.nextInt();
		}
		
		boolean change = false;
		for (int i = 1; i < N + 1; i++) {
			change = false;
			for (int j = 1; j <= N - i; j++) {
				if (A[j] > A[j + 1]) {
					change = true;
					swap(A, j);
				}
			}
			if (change == false) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void swap(int[] A, int j) {
		int tmp = A[j];
		A[j] = A[j + 1];
		A[j + 1] = tmp;
	}
	
}
