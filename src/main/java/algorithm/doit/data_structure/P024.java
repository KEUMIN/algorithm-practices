package algorithm.doit.data_structure;

import java.util.Scanner;

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
}
