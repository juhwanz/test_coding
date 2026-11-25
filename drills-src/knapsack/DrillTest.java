import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/knapsack
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("백준 12865 예제", Drill.knapsack(7, new int[] {6, 4, 3, 5}, new int[] {13, 8, 6, 12}), 14L);
        Check.eq("한 번만 쓰기", Drill.knapsack(10, new int[] {5}, new int[] {10}), 10L);
        Check.eq("W=0", Drill.knapsack(0, new int[] {1}, new int[] {5}), 0L);
        int n = 100, W = 100_000; int[] w = new int[n], v = new int[n];
        for (int i = 0; i < n; i++) { w[i] = 1000 + i; v[i] = 30_000_000; }
        Check.eq("물건 100개, W=10만 (가치 합 int 넘침)", Drill.knapsack(W, w, v), 2_850_000_000L);
        Check.done();
    }
}
