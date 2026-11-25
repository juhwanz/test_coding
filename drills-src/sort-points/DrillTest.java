import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/sort-points
public class DrillTest {
    public static void main(String[] args) {
        int[][] p = {{3, 4}, {1, 1}, {1, -1}, {2, 2}};
        Drill.sortPoints(p);
        Check.eq("기본", p, new int[][] {{1, -1}, {1, 1}, {2, 2}, {3, 4}});
        int[][] q = {{Integer.MAX_VALUE, 0}, {Integer.MIN_VALUE, 0}, {0, Integer.MIN_VALUE}, {0, Integer.MAX_VALUE}};
        Drill.sortPoints(q);
        Check.eq("int 끝값 (뺄셈 비교면 넘침)", q,
                new int[][] {{Integer.MIN_VALUE, 0}, {0, Integer.MIN_VALUE}, {0, Integer.MAX_VALUE}, {Integer.MAX_VALUE, 0}});
        Check.done();
    }
}
