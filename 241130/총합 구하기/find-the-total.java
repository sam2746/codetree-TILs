import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        while(a<=b){
            if(a%6 == 0 && a%8 != 0){
                sum += a;
            }
            a++;
        }

        System.out.println(sum);

    }
}