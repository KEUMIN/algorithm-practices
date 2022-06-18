package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class P017 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rawString = br.readLine();
		
		int[] A = Stream.of(rawString.split("")).mapToInt(Integer::parseInt).toArray();
		int mxIdx = 0;
		
		for (int i = 0; i < A.length - 1; i++) {
			mxIdx = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[mxIdx] < A[j]) {
					mxIdx = j;
				}
			}
			int tmp = A[mxIdx];
			A[mxIdx] = A[i];
			A[i] = tmp;
		}
		Arrays.stream(A).forEach(System.out::print);
	}
}
