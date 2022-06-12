package algorithm.doit.data_structure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		Deque<Integer> deque = new LinkedList<>();
		for (int i = N; i >= 1; i--) {
			deque.add(i);
		}
	}
}
