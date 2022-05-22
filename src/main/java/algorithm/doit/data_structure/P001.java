package algorithm.doit.data_structure;

import java.io.IOException;
import java.util.Scanner;

/*
 * 백준 11720번
 * 느낀 바 띄어쓰기로 입력값이 구분된다면 BufferedReader + StringTokenizer 쓰고
 * 붙어 있으면 Scanner 로 읽는다.
 */
public class P001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] A = sc.next().toCharArray();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Character.getNumericValue(A[i]);
//            sum += A[i] - '0';  --> 속도 더 느리다.
        }
        System.out.println(sum);
    }
}
