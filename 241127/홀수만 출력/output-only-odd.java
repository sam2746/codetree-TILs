import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int c = a;c<=b;c++){
            if(c%2 == 1){
                System.out.print(c+" ");
                c++;

            }
        }
    }
}