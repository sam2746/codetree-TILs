import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0;i<n;i++){
            int k = scanner.nextInt();
            if(k%2 == 1 && k%3 == 0){
                System.out.println(k);
            }
        }
    }
}