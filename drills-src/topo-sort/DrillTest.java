import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/topo-sort
public class DrillTest {
    public static void main(String[] args) {
        int[][] e = {{0, 2}, {1, 2}, {2, 3}, {4, 3}};
        Check.eq("순서가 올바름", valid(5, e, Drill.topo(directed(5, e))), true);
        Check.eq("고립 정점 포함", valid(3, new int[][] {}, Drill.topo(directed(3, new int[][] {}))), true);
        Check.eq("사이클이면 크기 < V", Drill.topo(directed(3, new int[][] {{0, 1}, {1, 2}, {2, 1}})).size() < 3, true);
        int n = 200_000; int[][] chain = new int[n - 1][];
        for (int i = 0; i + 1 < n; i++) chain[i] = new int[] {n - 1 - i, n - 2 - i};
        Check.eq("정점 20만", valid(n, chain, Drill.topo(directed(n, chain))), true);
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

    static boolean valid(int n, int[][] edges, List<Integer> order) {
        if (order.size() != n) return false;
        int[] pos = new int[n]; Arrays.fill(pos, -1);
        for (int i = 0; i < n; i++) { int v = order.get(i); if (pos[v] != -1) return false; pos[v] = i; }
        for (int[] e : edges) if (pos[e[0]] > pos[e[1]]) return false;
        return true;
    }
}
