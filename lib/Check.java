import java.util.Arrays;

// 프로그래머스 Test.java에서 쓰는 비교 도구. 배열도 내용으로 비교한다.
public final class Check {
    private static int total;
    private static int passed;

    private Check() {}

    public static void eq(Object actual, Object expected) {
        eq("예제 " + (total + 1), actual, expected);
    }

    // 이름 붙은 검사 (drills 테스트에서 쓴다)
    public static void eq(String name, Object actual, Object expected) {
        total++;
        boolean ok = Arrays.deepEquals(new Object[] {actual}, new Object[] {expected});
        if (ok) passed++;
        System.out.printf("%s: %s%n", name, ok ? "통과" : "실패");
        if (!ok) {
            System.out.println("  기대: " + show(expected));
            System.out.println("  실제: " + show(actual));
        }
    }

    public static void done() {
        if (total == 0) {
            System.out.println("Test.java에 예제가 없다. Check.eq(...)를 추가한다.");
            System.exit(1);
        }
        System.out.printf("%d/%d 통과%n", passed, total);
        if (passed != total) System.exit(1);
    }

    private static String show(Object o) {
        String s = Arrays.deepToString(new Object[] {o});
        return s.substring(1, s.length() - 1);
    }
}
