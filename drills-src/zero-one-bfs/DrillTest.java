import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/zero-one-bfs
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("0 간선으로 돌아가기", Drill.zeroOne(weighted(4, new int[][] {{0, 1, 1}, {0, 2, 0}, {2, 1, 0}}), 0),
                new int[] {0, 0, 0, Integer.MAX_VALUE});
        Check.eq("1 간선만", Drill.zeroOne(weighted(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}), 0), new int[] {0, 1, 1});
        Check.eq("늦게 찾은 짧은 길", Drill.zeroOne(weighted(4, new int[][] {{0, 3, 1}, {0, 1, 1}, {1, 2, 0}, {2, 3, 0}}), 0),
                new int[] {0, 1, 1, 1});
        int n = 200_000; int[][] e = new int[2 * (n - 1)][];
        for (int i = 0; i + 1 < n; i++) { e[2 * i] = new int[] {i, i + 1, 0}; e[2 * i + 1] = new int[] {i, i + 1, 1}; }
        Check.eq("정점 20만", Drill.zeroOne(weighted(n, e), 0)[n - 1], 0);
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
