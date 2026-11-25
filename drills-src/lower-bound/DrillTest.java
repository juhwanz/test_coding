import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/lower-bound
public class DrillTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 5};
        Check.eq("중복 값", Drill.lowerBound(a, 2), 1);
        Check.eq("없는 값", Drill.lowerBound(a, 3), 4);
        Check.eq("가장 작음", Drill.lowerBound(a, 0), 0);
        Check.eq("가장 큼 → 길이", Drill.lowerBound(a, 6), 5);
        Check.eq("빈 배열", Drill.lowerBound(new int[] {}, 1), 0);
        int n = 1_000_000; int[] big = new int[n];
        for (int i = 0; i < n; i++) big[i] = 2 * i;
        long got = 0, want = 0;
        for (int q = 0; q < n; q++) { got += Drill.lowerBound(big, q); want += (q + 1) / 2; }
        Check.eq("100만 번 질의 (선형 탐색이면 시간 초과)", got, want);
        Check.done();
    }
}
