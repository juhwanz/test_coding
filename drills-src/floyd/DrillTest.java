import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/floyd
public class DrillTest {
    public static void main(String[] args) {
        long I = Drill.INF;
        long[][] d = {{0, 5, 10, I}, {I, 0, 3, I}, {I, I, 0, 1}, {I, I, I, 0}};
        Drill.floyd(d);
        Check.eq("방향 그래프", d, new long[][] {{0, 5, 8, 9}, {I, 0, 3, 4}, {I, I, 0, 1}, {I, I, I, 0}});
        long[][] neg = {{0, 4, I}, {I, 0, -2}, {I, I, 0}};
        Drill.floyd(neg);
        Check.eq("음수 간선", neg[0][2], 2L);
        int n = 300; long[][] big = new long[n][n];
        for (int i = 0; i < n; i++) { Arrays.fill(big[i], I); big[i][i] = 0; if (i + 1 < n) big[i][i + 1] = 1; }
        Drill.floyd(big);
        Check.eq("정점 300 일렬", big[0][n - 1], (long) (n - 1));
        Check.done();
    }
}
