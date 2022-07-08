package algorithm.doit.data_structure;

import java.util.Scanner;

import static java.lang.Math.*;

public class P024 {
    static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int a, int b) {
        if (b == N) {
            if (isPrime(a)) {
                System.out.println(a);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(a * 10 + i)) {
                DFS(a * 10 + i, b + 1);
            }
        }
    }
    static boolean isPrime(int x) {
        if (x == 2 || x == 3) return true;
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
