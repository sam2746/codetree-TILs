import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(gongyak(n, m));

    }

    public static int gongyak(int n, int m){
        
        int max = 1;

        int temp;

        if(m>n){
            temp = m;
            m = n;
            n = temp;    

        }

        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                if(m%i == 0){
                    max = i;
                }
            }
        }

        return max;
    }
}