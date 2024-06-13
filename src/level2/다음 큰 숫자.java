package level2;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int oneCount = oneCheck(n);

        while(true){
            n++;

            if(oneCount == oneCheck(n)){
                answer = n;
                break;
            }

        }

        return answer;
    }

    // 2진법으로 바꾸고 1의 갯수 구하기
    public int oneCheck(int n){

        String str = Integer.toBinaryString(n);

        int oneCount = 0;

        for (char c : str.toCharArray()) {

            if (c == '1') {
                oneCount++;
            }
        }

        return oneCount;

    }

    // Integer.bitCount() 메서드를 사용하면 1의 갯수를 알려줌
}
