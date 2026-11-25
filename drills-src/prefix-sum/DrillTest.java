import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/prefix-sum
public class DrillTest {
    public static void main(String[] args) {
        long[] p = Drill.prefix(new int[] {1, 2, 3, 4, 5});
        Check.eq("prefix", p, new long[] {0, 1, 3, 6, 10, 15});
        Check.eq("[1,3]", Drill.rangeSum(p, 1, 3), 9L);
        Check.eq("[0,0]", Drill.rangeSum(p, 0, 0), 1L);
        Check.eq("[4,4]", Drill.rangeSum(p, 4, 4), 5L);
        long[] o = Drill.prefix(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE});
        Check.eq("int 넘침", Drill.rangeSum(o, 0, 1), 2L * Integer.MAX_VALUE);
        int n = 1_000_000; int[] ones = new int[n]; Arrays.fill(ones, 1);
        long[] q = Drill.prefix(ones); long got = 0, want = 0;
        for (int i = 0; i < n; i++) { got += Drill.rangeSum(q, i / 2, i); want += i - i / 2 + 1; }
        Check.eq("100만 번 질의 (질의마다 더하면 시간 초과)", got, want);
        Check.done();
    }
}
