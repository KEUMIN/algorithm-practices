package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import algorithm.BFSPractice;

public class P011 {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer buffer = new StringBuffer();
		int num = 1;
		boolean result = true;
		
		for (int i = 0; i < A.length; i++) {
			int su = A[i];
			if (su >= num) {
				while(su >= num) {
					stack.push(num++);
					buffer.append("+\n");					
				}
				stack.pop();
				buffer.append("-\n");
			}
			else {
				int n = stack.pop();
				
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					buffer.append("-/n");
				}
			}
		}
		if (result) {
			System.out.println(buffer.toString());
		}
	}
}
