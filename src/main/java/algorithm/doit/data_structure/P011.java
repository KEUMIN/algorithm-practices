package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P011 {
	private static Stack<Integer> targetStack = new Stack<Integer>();
	private static Stack<Integer> A = new Stack<Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			targetStack.push(Integer.parseInt(br.readLine()));
		}
		for (int i = 0; i < N; i++) {
			int target = targetStack.pop();
			int num = 1;
			while (target == num + 1) {
				A.push(num);
				bw.write('+');
				num++;
				
			}
		}
	}
}
