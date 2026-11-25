import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/fenwick
public class DrillTest {
    public static void main(String[] args) {
        long[] bit = new long[6];
        for (int i = 1; i <= 5; i++) Drill.add(bit, i, i);
        Check.eq("sum(5)", Drill.sum(bit, 5), 15L);
        Check.eq("sum(3)", Drill.sum(bit, 3), 6L);
        Check.eq("sum(0)", Drill.sum(bit, 0), 0L);
        Drill.add(bit, 3, 10);
        Check.eq("갱신 후 [2,4]", Drill.sum(bit, 4) - Drill.sum(bit, 1), 19L);
        int n = 1_000_000; long[] big = new long[n + 1];
        for (int i = 1; i <= n; i++) Drill.add(big, i, 1);
        long got = 0; for (int i = 1; i <= n; i++) got += Drill.sum(big, i);
        Check.eq("100만 번 갱신·질의", got, (long) n * (n + 1) / 2);
        Check.done();
    }
}
