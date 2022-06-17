package algorithm.doit.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class P016 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		mData[] A = new mData[N];
		for (int i = 1; i < N; i++) {
			int x = scanner.nextInt();
			A[i] = new mData(x, i);
		}
		
		Arrays.sort(A);
		int Max = 0;
		for (int i = 0; i < N; i++) {
			if (Max < A[i].index -1) {
				Max = A[i].index - i;
			}
		}
		System.out.println(Max + 1);
	}
	class mData implements Comparable<mData> {
		int value;
		int index;
		
		public mData(int value, int index) {
			this.value = value;
			this.index = index;
		}

		@Override
		public int compareTo(mData o) {
			return this.value - o.value;
		}
		
	}
}
