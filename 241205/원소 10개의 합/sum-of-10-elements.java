import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for(int i = 0;i<10;i++){
            int input = scanner.nextInt();
            sum += input;
        }
        System.out.println(sum);
    }
}