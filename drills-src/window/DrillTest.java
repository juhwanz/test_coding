import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/window
public class DrillTest {
    public static void main(String[] args) {
        int[] a = {3, -2, -4, -9, 0, 3, 7, 13, 8, -3};
        Check.eq("백준 2559 예제 k=2", Drill.maxWindowSum(a, 2), 21L);
        Check.eq("백준 2559 예제 k=5", Drill.maxWindowSum(a, 5), 31L);
        Check.eq("모두 음수", Drill.maxWindowSum(new int[] {-5, -1, -3}, 1), -1L);
        Check.eq("k = n", Drill.maxWindowSum(new int[] {1, 2, 3}, 3), 6L);
        Check.eq("int 넘침", Drill.maxWindowSum(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}, 2), 2L * Integer.MAX_VALUE);
        int[] big = new int[1_000_000]; Arrays.fill(big, 1);
        Check.eq("길이 100만, k=50만", Drill.maxWindowSum(big, 500_000), 500_000L);
        Check.done();
    }
}
