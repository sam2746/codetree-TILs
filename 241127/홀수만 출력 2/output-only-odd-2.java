import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();

        for(int c = b;c>=a;c--){
            if(c%2 == 1){
                System.out.print(c+" ");
            }
        }
    }
}