// 문제 페이지의 입출력 예를 옮겨 적는다. 제출하지 않는 파일.
// 예: Check.eq(new Solution().solution(new int[]{1, 2, 3}, 2), 5);
// 반환형이 long이면 기대값에 L을 붙인다 (5L). 배열은 new int[]{...}로 적는다.
public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        Check.eq(s.solution("a234"), false);
        Check.eq(s.solution("1234"), true);
        Check.eq(s.solution("12345"), false);    // 반례: 숫자만이지만 길이 5
        Check.eq(s.solution("123456"), true);    // 반례: 길이 6
        Check.eq(s.solution("1234567"), false);  // 반례: 숫자만이지만 길이 7
        Check.eq(s.solution("12a456"), false);   // 반례: 길이 6인데 중간에 영문자
        Check.eq(s.solution("1"), false);        // 반례: 최소 길이

        Check.done();
    }
}
