import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(weird(N));
    }

    public static int weird(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }

        return weird(n/3) + weird(n-1);
    }
}