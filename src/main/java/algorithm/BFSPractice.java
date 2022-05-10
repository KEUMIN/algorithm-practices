package algorithm;

import java.io.*;
import java.util.*;

import static java.util.Comparator.comparing;

public class BFSPractice {
    private static boolean[] visited;
    private static ArrayList<Integer>[] G;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodes = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        G = new ArrayList[nodes + 1];
        for (int i = 0; i < G.length; i++) {
            G[i] = new ArrayList<>();
        }

        visited = new boolean[nodes + 1];
        for (int i = 1; i < edges + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            G[n].add(m);
            G[m].add(n);
        }

        Arrays.stream(G).forEach(a -> a.sort(comparing(Integer::intValue))); // 리스트

        DFS(start, bw);
        bw.flush();
        System.out.println();
        visited = new boolean[nodes + 1];
        BFS(start, bw);
        bw.flush();
        bw.close();
    }
    static void DFS(int x, BufferedWriter bw) throws IOException {
        if (visited[x] == true) return;
        visited[x] = true;
        bw.write(x + " ");
        for (Integer node : G[x]) {
            DFS(node, bw);
        }
    }

    static void BFS(int Node, BufferedWriter bw) throws IOException {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            bw.write(now_Node + " ");
            for (int i : G[now_Node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
