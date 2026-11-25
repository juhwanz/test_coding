import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/parens
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("()()", Drill.valid("()()"), true);
        Check.eq("(())()", Drill.valid("(())()"), true);
        Check.eq(")()(", Drill.valid(")()("), false);
        Check.eq("(()(", Drill.valid("(()("), false);
        Check.eq("( 하나", Drill.valid("("), false);
        Check.eq(") 하나 (빈 스택 pop)", Drill.valid(")"), false);
        Check.eq("빈 문자열", Drill.valid(""), true);
        Check.eq("길이 100만", Drill.valid("(".repeat(500_000) + ")".repeat(500_000)), true);
        Check.done();
    }
}
