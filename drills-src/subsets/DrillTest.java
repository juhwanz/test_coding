import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/subsets
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("{1,2,3}", norm(Drill.subsets(new int[] {1, 2, 3})),
                List.of("[1, 2, 3]", "[1, 2]", "[1, 3]", "[1]", "[2, 3]", "[2]", "[3]", "[]"));
        Check.eq("빈 배열", norm(Drill.subsets(new int[] {})), List.of("[]"));
        Check.eq("원소 15개 → 32768개", Drill.subsets(new int[15]).size(), 32768);
        Check.done();
    }

    static List<String> norm(List<List<Integer>> s) {
        List<String> r = new ArrayList<>();
        for (List<Integer> x : s) r.add(x.toString());
        Collections.sort(r);
        return r;
    }
}
