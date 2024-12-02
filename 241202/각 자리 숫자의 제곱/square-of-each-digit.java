import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(sumOfDigit(N));
    }

    public static int sumOfDigit(int n){
        if(n < 10){
            return n*n;
        }

        //n의 자리수를 파악하고, 나눈 값을 저장한 후에 처리(제곱)하고, n의 자리수를 작게 한다.
        int len = String.valueOf(n).length();
        //k는 최상위 자리수의 값
        int k = (int) (n/Math.pow(10, len-1));
        //k를 제곱해 준다.
        k  = k*k;

        //입력값의 자리수를 줄인다(맨 앞자리 제거)
        n = (int) (n%Math.pow(10, (len-1)));
        return sumOfDigit(n) + k;
    }
}