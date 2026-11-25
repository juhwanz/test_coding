import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/make-one
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("n=1", Drill.makeOne(1), 0);
        Check.eq("n=2", Drill.makeOne(2), 1);
        Check.eq("n=10 (그리디면 4)", Drill.makeOne(10), 3);
        Check.eq("n=1,000,000", Drill.makeOne(1_000_000), 19);
        Check.done();
    }
}
