import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner =  new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();

        while(b>=a){
            System.out.print(b+" ");
            b -= 2;
        }
    }
}