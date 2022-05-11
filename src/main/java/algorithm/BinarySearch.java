package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch {
    private static int[] A;
    private static int[] F;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        A = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int find = Integer.parseInt(br.readLine());
        F = new int[find];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < find; i++) {
            F[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < find; i++) {
            System.out.println(binarySearch(F[i], A));
        }
    }

    public static int binarySearch(int num, int[] arr) {
        boolean finded = false;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midi = (start + end) / 2;
            int midv = arr[midi];
            if (midv > num) {
                end = midi - 1;
            } else if (midv < num) {
                start = midi + 1;
            } else {
                finded = true;
                break;
            }
        }
        if (finded) {
            return 1;
        } else {
            return 0;
        }
    }
}
