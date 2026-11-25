import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/first-true
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("x*x >= 50", Drill.firstTrue(0, 100, x -> x * x >= 50), 8L);
        Check.eq("lo == hi", Drill.firstTrue(7, 7, x -> true), 7L);
        Check.eq("처음부터 true", Drill.firstTrue(3, 100, x -> true), 3L);
        Check.eq("큰 범위 (mid 넘침)", Drill.firstTrue(0, Long.MAX_VALUE - 1, x -> x >= 5_000_000_000_000_000_000L),
                5_000_000_000_000_000_000L);
        Check.done();
    }
}
