import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/shortest-window
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("백준 1806 예제", Drill.shortest(new int[] {5, 1, 3, 5, 10, 7, 4, 9, 2, 8}, 15), 2);
        Check.eq("없음", Drill.shortest(new int[] {1, 1, 1}, 10), 0);
        Check.eq("한 칸", Drill.shortest(new int[] {10}, 5), 1);
        Check.eq("전체", Drill.shortest(new int[] {1, 2, 3}, 6), 3);
        int[] big = new int[1_000_000]; Arrays.fill(big, 1);
        Check.eq("길이 100만", Drill.shortest(big, 500_000), 500_000);
        Check.done();
    }
}
