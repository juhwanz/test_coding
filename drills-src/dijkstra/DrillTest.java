import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/dijkstra
public class DrillTest {
    public static void main(String[] args) {
        List<List<int[]>> g = weighted(5, new int[][] {{4, 0, 1}, {0, 1, 2}, {0, 2, 3}, {1, 2, 4}, {1, 3, 5}, {2, 3, 6}});
        Check.eq("백준 1753 예제 (0-based)", Drill.dijkstra(0, g), new long[] {0, 2, 3, 7, Long.MAX_VALUE});
        Check.eq("가중치 0", Drill.dijkstra(0, weighted(3, new int[][] {{0, 1, 0}, {1, 2, 0}, {0, 2, 5}})), new long[] {0, 0, 0});
        Check.eq("돌아가는 길이 더 짧음", Drill.dijkstra(0, weighted(3, new int[][] {{0, 2, 10}, {0, 1, 1}, {1, 2, 1}})),
                new long[] {0, 1, 2});
        int n = 200_000; int[][] e = new int[n - 1][];
        for (int i = 0; i + 1 < n; i++) e[i] = new int[] {i, i + 1, 1_000_000};
        Check.eq("정점 20만 일렬 (거리 합이 int 넘침)", Drill.dijkstra(0, weighted(n, e))[n - 1], (n - 1) * 1_000_000L);
        Check.done();
    }

    static List<List<Integer>> undirected(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) { g.get(e[0]).add(e[1]); g.get(e[1]).add(e[0]); }
        return g;
    }
    static List<List<Integer>> directed(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) g.get(e[0]).add(e[1]);
        return g;
    }
    static List<List<int[]>> weighted(int n, int[][] edges) {
        List<List<int[]>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) g.get(e[0]).add(new int[] {e[1], e[2]});
        return g;
    }
}
