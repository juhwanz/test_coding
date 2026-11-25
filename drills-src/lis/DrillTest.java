import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/lis
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("백준 11053 예제", Drill.lis(new int[] {10, 20, 10, 30, 20, 50}), 4);
        Check.eq("빈 배열", Drill.lis(new int[] {}), 0);
        Check.eq("모두 같음 (엄격 증가)", Drill.lis(new int[] {5, 5, 5}), 1);
        Check.eq("감소", Drill.lis(new int[] {3, 2, 1}), 1);
        int n = 200_000; int[] big = new int[n];
        for (int i = 0; i < n; i++) big[i] = i % 2 == 0 ? i : -i;
        Check.eq("길이 20만 (O(N^2)이면 시간 초과)", Drill.lis(big), n / 2);
        Check.done();
    }
}
