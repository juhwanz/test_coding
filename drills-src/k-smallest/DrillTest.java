import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/k-smallest
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("기본", Drill.kSmallest(new int[] {5, 1, 4, 1, 3}, 3), new int[] {1, 1, 3});
        Check.eq("k=0", Drill.kSmallest(new int[] {2, 1}, 0), new int[] {});
        Check.eq("k=n", Drill.kSmallest(new int[] {2, -1}, 2), new int[] {-1, 2});
        int[] big = new int[1_000_000];
        for (int i = 0; i < big.length; i++) big[i] = (int) ((i * 7919L) % 1_000_003) - 500_000;
        int[] sorted = big.clone(); Arrays.sort(sorted);
        Check.eq("100만 개 중 10개", Drill.kSmallest(big, 10), Arrays.copyOf(sorted, 10));
        Check.done();
    }
}
