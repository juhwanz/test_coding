import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/grid-bfs
public class DrillTest {
    public static void main(String[] args) {
        int[][] g = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        Check.eq("기본", Drill.gridBfs(g, 0, 0), new int[][] {{0, 1, -1}, {-1, 2, -1}, {-1, 3, 4}});
        Check.eq("막힌 칸", Drill.gridBfs(new int[][] {{1, 0, 1}}, 0, 0), new int[][] {{0, -1, -1}});
        Check.eq("직사각형 (행·열 혼동)", Drill.gridBfs(new int[][] {{1, 1, 1, 1}}, 0, 3), new int[][] {{3, 2, 1, 0}});
        int n = 1000; int[][] big = new int[n][n];
        for (int[] row : big) Arrays.fill(row, 1);
        Check.eq("1000x1000 반대쪽 끝", Drill.gridBfs(big, 0, 0)[n - 1][n - 1], 2 * (n - 1));
        Check.done();
    }
}
