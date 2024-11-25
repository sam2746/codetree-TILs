import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(sumation(n));


    }

    public static int sumation(int n){
        int sum = 0;

        for(int i = 1;i<n+1;i++){
            sum += i;
        }

        return sum/10;
    }
}