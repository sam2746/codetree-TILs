import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int mulSum = 1;

        for(int i = 1;i<=b;i++){
            if(i%a==0){
                mulSum = mulSum * i;
            }
        }

        System.out.println(mulSum);
    }
}