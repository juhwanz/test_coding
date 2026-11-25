import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/graph-bfs
public class DrillTest {
    public static void main(String[] args) {
        List<List<Integer>> g = undirected(6, new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}});
        Check.eq("기본 (5는 고립)", Drill.bfs(0, g), new int[] {0, 1, 1, 2, 3, -1});
        Check.eq("다른 시작점", Drill.bfs(4, g), new int[] {3, 2, 2, 1, 0, -1});
        Check.eq("방향 그래프", Drill.bfs(1, directed(3, new int[][] {{0, 1}, {1, 2}})), new int[] {-1, 0, 1});
        int n = 200_000; int[][] path = new int[n - 1][];
        for (int i = 0; i + 1 < n; i++) path[i] = new int[] {i, i + 1};
        Check.eq("정점 20만 일자 그래프 끝", Drill.bfs(0, undirected(n, path))[n - 1], n - 1);
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
