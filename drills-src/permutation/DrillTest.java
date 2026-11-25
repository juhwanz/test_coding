import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/permutation
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("n=3 m=1", Drill.perm(3, 1), List.of("1", "2", "3"));
        Check.eq("n=3 m=2", Drill.perm(3, 2), List.of("1 2", "1 3", "2 1", "2 3", "3 1", "3 2"));
        List<String> p = Drill.perm(4, 4);
        Check.eq("n=4 m=4 개수", p.size(), 24);
        Check.eq("n=4 m=4 마지막", p.get(23), "4 3 2 1");
        Check.eq("n=8 m=8 개수", Drill.perm(8, 8).size(), 40320);
        Check.done();
    }
}
