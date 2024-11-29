import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;

        for(int i = 0;i<5;i++){
            int k = scanner.nextInt();

            if(k%2 == 0){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}