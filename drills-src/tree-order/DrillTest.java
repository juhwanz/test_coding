import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/tree-order
public class DrillTest {
    public static void main(String[] args) {
        // 백준 1991 예제 트리: A0 B1 C2 D3 E4 F5 G6
        int[] l = {1, 3, 4, -1, -1, -1, -1};
        int[] r = {2, -1, 5, -1, -1, 6, -1};
        Check.eq("전위", Drill.preorder(l, r, 0), List.of(0, 1, 3, 2, 4, 5, 6));
        Check.eq("중위", Drill.inorder(l, r, 0), List.of(3, 1, 0, 4, 2, 5, 6));
        Check.eq("후위", Drill.postorder(l, r, 0), List.of(3, 1, 4, 6, 5, 2, 0));
        Check.eq("정점 하나", Drill.inorder(new int[] {-1}, new int[] {-1}, 0), List.of(0));
        Check.done();
    }
}
