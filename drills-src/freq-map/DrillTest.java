import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/freq-map
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("기본", Drill.frequency(new String[] {"kim", "lee", "kim", "park", "kim"}),
                Map.of("kim", 3, "lee", 1, "park", 1));
        Check.eq("빈 배열", Drill.frequency(new String[] {}), Map.of());
        String[] big = new String[1_000_000];
        for (int i = 0; i < big.length; i++) big[i] = "n" + (i % 1000);
        Check.eq("100만 개 중 n7", Drill.frequency(big).get("n7"), 1000);
        Check.done();
    }
}
