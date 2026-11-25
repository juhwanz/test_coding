import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/letters
public class DrillTest {
    public static void main(String[] args) {
        int[] e = new int[26];
        e['h' - 'a'] = 1; e['e' - 'a'] = 1; e['l' - 'a'] = 3; e['o' - 'a'] = 2;
        e['w' - 'a'] = 1; e['r' - 'a'] = 1; e['d' - 'a'] = 1;
        Check.eq("문장부호 섞임", Drill.countLetters("Hello, World!"), e);
        Check.eq("빈 문자열", Drill.countLetters(""), new int[26]);
        int[] z = new int[26]; z[25] = 3;
        Check.eq("대소문자 섞임", Drill.countLetters("ZzZ"), z);
        Check.done();
    }
}
