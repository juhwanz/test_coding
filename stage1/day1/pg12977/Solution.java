import java.util.*;

// 프로그래머스 문제 페이지의 solution 메서드 틀을 그대로 붙여 넣는다.
// 제출할 때는 이 파일 내용만 복사한다.
class Solution {
    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int d = 2; d * d <= x; d++) {
            if (x % d == 0) return false;
        }
        return true;
    }
}
