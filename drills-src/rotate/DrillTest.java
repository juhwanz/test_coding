import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/rotate
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("2x3", Drill.rotate90(new int[][] {{1, 2, 3}, {4, 5, 6}}), new int[][] {{4, 1}, {5, 2}, {6, 3}});
        Check.eq("1x1", Drill.rotate90(new int[][] {{7}}), new int[][] {{7}});
        int[][] s = {{1, 2}, {3, 4}};
        Check.eq("네 번 돌리면 제자리", Drill.rotate90(Drill.rotate90(Drill.rotate90(Drill.rotate90(s)))), s);
        Check.done();
    }
}
