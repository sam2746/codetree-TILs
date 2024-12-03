import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n =2 ;

        for(int i = a;i<=b;i++){
            if(1920%i == 0 && 2880%i == 0){
                n = 1;
                System.out.println(n);
                break;
            }
        }

        if(n == 2){
            System.out.println(0);
        }
    }
}