package algorithm.doit.data_structure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i = N; i >= 1; i--) {
			deque.push(i);
		}

		
		while (deque.size() > 1) { 
			deque.pop();
			Integer temp = deque.pop();
			deque.addLast(temp);
		}
		System.out.println(deque.pop());
	}
}
