import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/union-find
public class DrillTest {
    public static void main(String[] args) {
        Drill.init(5);
        Check.eq("union(0,1)", Drill.union(0, 1), true);
        Check.eq("union(1,0) 이미 같음", Drill.union(1, 0), false);
        Check.eq("find(0)==find(1)", Drill.find(0) == Drill.find(1), true);
        Check.eq("find(2)!=find(0)", Drill.find(2) == Drill.find(0), false);
        Drill.union(3, 4); Drill.union(1, 4);
        Check.eq("건너서 연결", Drill.find(0) == Drill.find(3), true);
        int n = 1_000_000; Drill.init(n);
        for (int i = 0; i + 1 < n; i++) Drill.union(i, i + 1);
        Check.eq("100만 개 일렬 연결", Drill.find(0) == Drill.find(n - 1), true);
        Check.eq("백준 1197 예제", Drill.mst(3, new int[][] {{0, 1, 1}, {1, 2, 2}, {0, 2, 3}}), 3L);
        Check.eq("음수 가중치", Drill.mst(3, new int[][] {{0, 1, -5}, {1, 2, 2}, {0, 2, -1}}), -6L);
        Check.done();
    }
}
