package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            int find = arr[i];
            int start = 0;
            int end = num - 1;

            // 투 포인터 알고리즘 - 외우자!
            while (start < end) {
                if (arr[start] + arr[end] == find) {
                    if (start != i && end != i) {
                        cnt++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (arr[start] + arr[end] < find) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(cnt);
        bf.close();
    }
}
