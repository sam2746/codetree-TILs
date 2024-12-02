import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println(max(n, scanner));
    }

    public static int max(int n, Scanner scanner){

        int k = scanner.nextInt();

        if (n == 1) {
            return k; // 마지막 값일 경우 반환
        }

        int nextMax = max(n - 1, scanner);

        //그렇다면 지금 받은 k와 다음에 실행할 k를 비교하는 chain을 만들 수 있음
        if(k > nextMax){
            return k;
        }else{
            return nextMax;
        }

        // n = 1일 때 받은 k로부터 n = 6(test case)일 때 받은 k 까지 싸그리 비교 가능함
    }
}