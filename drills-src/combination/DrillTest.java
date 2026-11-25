import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/combination
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("n=4 k=2", Drill.comb(4, 2), List.of("1 2", "1 3", "1 4", "2 3", "2 4", "3 4"));
        Check.eq("n=3 k=3", Drill.comb(3, 3), List.of("1 2 3"));
        Check.eq("n=20 k=10 개수", Drill.comb(20, 10).size(), 184756);
        Check.done();
    }
}
