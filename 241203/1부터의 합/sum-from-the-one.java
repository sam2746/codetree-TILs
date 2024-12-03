import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1;i<=100;i++){
            if(sum + i >= n){
                System.out.println(i);
                break;
            }else{
                sum += i;            }
        }
    }
}