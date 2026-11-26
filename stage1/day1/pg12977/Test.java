// 문제 페이지의 입출력 예를 옮겨 적는다. 제출하지 않는 파일.
// 예: Check.eq(new Solution().solution(new int[]{1, 2, 3}, 2), 5);
// 반환형이 long이면 기대값에 L을 붙인다 (5L). 배열은 new int[]{...}로 적는다.
public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        Check.eq(s.solution(new int[]{1, 2, 3, 4}), 1);
        Check.eq(s.solution(new int[]{1, 2, 7, 6, 4}), 4);

        Check.done();
    }
}
