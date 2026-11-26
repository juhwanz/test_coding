import java.util.*;

// 프로그래머스 문제 페이지의 solution 메서드 틀을 그대로 붙여 넣는다.
// 제출할 때는 이 파일 내용만 복사한다.
class Solution {
	// public booelan solution(String s){          // 틀림: 철자 (booelan)
	public boolean solution(String s){                // 수정 1
		if(s.length() != 4 && s.length() != 6) return false;   // 수정 3: 길이 4 또는 6만 통과 (빠져 있었음)
		for(char a : s.toCharArray()){
			// if(a>9) return false;                  // 틀림: '0'은 실제 값 48이라 a > 9는 항상 참
			if(a < '0' || a > '9') return false;      // 수정 2: 문자끼리 비교 ('0'~'9' 밖이면 숫자 아님)
		}
		return true;
	}
}
