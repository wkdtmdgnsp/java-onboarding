package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        // 페이지 예외사항 처리
        if(pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1)
            return answer = -1;

        return answer;
    }

    // 합구하기
    public static int addNum(int num) {
        int sum = 0;

        while(num!=0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    // 곱구하기
    public static int multiNum(int num) {
        int sum = 1;

        while(num!=0) {
            sum *= num % 10;
            num /= 10;
        }

        return sum;
    }

    // 큰 숫자 찾기
    public static int compareNum(int num1, int num2) {
        int left = Math.max(addNum(num1), multiNum(num1));
        int right = Math.max(addNum(num2), multiNum(num2));
        int big = Math.max(left, right);

        return big;
    }
}