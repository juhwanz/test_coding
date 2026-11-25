import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/last-true
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("x*x <= 50", Drill.lastTrue(0, 100, x -> x * x <= 50), 7L);
        Check.eq("lo == hi", Drill.lastTrue(4, 4, x -> true), 4L);
        Check.eq("끝까지 true", Drill.lastTrue(0, 100, x -> true), 100L);
        Check.eq("lo만 true (무한 루프 주의)", Drill.lastTrue(0, 1, x -> x == 0), 0L);
        Check.eq("큰 범위 (mid 넘침)", Drill.lastTrue(0, Long.MAX_VALUE, x -> x <= 5_000_000_000_000_000_000L),
                5_000_000_000_000_000_000L);
        Check.done();
    }
}
