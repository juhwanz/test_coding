import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/meetings
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("백준 1931 예제", Drill.maxMeetings(new int[][] {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9},
                {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}}), 4);
        Check.eq("시작=끝 회의 (끝이 같으면 시작 순)", Drill.maxMeetings(new int[][] {{2, 2}, {1, 2}, {2, 3}}), 3);
        Check.eq("빈 배열", Drill.maxMeetings(new int[][] {}), 0);
        int n = 200_000; int[][] big = new int[n][];
        for (int i = 0; i < n; i++) big[i] = new int[] {i, i + 1};
        Check.eq("20만 개", Drill.maxMeetings(big), n);
        Check.done();
    }
}
