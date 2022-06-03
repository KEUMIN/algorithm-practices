package algorithm.doit.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P009_MySolution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken()); // 목표 숫자
        String str = br.readLine();
        char[] A = new char[S];
        for (int i = 0; i < S; i++) {
            A[i] = str.charAt(i);
        }
        int[] D = new int[4];
        int[] M = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D.length; i++) {
            D[i] = Integer.parseInt(st.nextToken());
            M[i] = D[i];
        }

        int start = 0;
        int end = 0;
        while (end != (S - 1) || start != (S - P)) {
        	if (end <= P - 1) {
				
			} else if (end > P - 1) {
				
			}
        }

    }
    public void check(int a) {
    	switch(a) {
    	case 'A' :
//    		M[0] = M[0] - 1;
    	}
    }
}