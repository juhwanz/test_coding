import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/graph-dfs
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("기본", Drill.components(undirected(6, new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}})), 2);
        Check.eq("정점 하나", Drill.components(undirected(1, new int[][] {})), 1);
        Check.eq("간선 없음", Drill.components(undirected(5, new int[][] {})), 5);
        Check.eq("사이클", Drill.components(undirected(3, new int[][] {{0, 1}, {1, 2}, {2, 0}})), 1);
        int n = 10_000; int[][] path = new int[n - 1][];
        for (int i = 0; i + 1 < n; i++) path[i] = new int[] {i, i + 1};
        Check.eq("정점 1만 일자 그래프 (재귀 깊이)", Drill.components(undirected(n, path)), 1);
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
