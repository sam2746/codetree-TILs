import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(sum(N));
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        return sum(n-1) + n;

    }
}