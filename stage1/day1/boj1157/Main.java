import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] ar = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        String str = br.readLine().toLowerCase();       // 수정 1: 소문자 변환은 여기서 한 번만
        for(int i = 0; i< str.length(); i++){
            // char ch = str.toLowerCase().charAt(i);   // 틀림: 반복마다 길이 N짜리 문자열을 새로 만듦 → O(N²)
            char ch = str.charAt(i);                     // 수정 1
            ar[ch-'a']++;
        }

        int max = 0;
        int num = 0;
        for(int i = 0; i<26; i++){
            if(max < ar[i]) {
                max = ar[i];
                num = i;
            }
        }

        int cnt = 0;
        for(int x : ar){
            if(x==max) cnt++;
            // if(cnt >= 2) return "?";                 // 틀림: main은 void라 값을 return할 수 없음
            if(cnt >= 2) {                               // 수정 2: 출력하고 끝낸다
                System.out.print('?');
                return;
            }
        }

        // return String.valueOf(num+'a');              // 틀림: return 불가 + num+'a'는 int라 "122"처럼 숫자가 나옴 + 소문자
        System.out.print((char) (num + 'A'));            // 수정 3: (char)로 글자로, 'A'를 더해 대문자로
    }
}
