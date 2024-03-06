/* 문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
"Zbcdefg"	"gfedcbZ" */

package level1;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer += arr[arr.length - 1 - i];
        }

        return answer;
    }

}

// public class ReverseStr {
//     public String reverseStr(String str){
//         char[] sol = str.toCharArray();
//     Arrays.sort(sol);
//     return new StringBuilder(new String(sol)).reverse().toString(); //StringBuilder에 reverse 사용
//     }