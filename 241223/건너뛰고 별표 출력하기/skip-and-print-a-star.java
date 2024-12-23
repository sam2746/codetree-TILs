import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1;i<=2*n-1;i++){
            // 1개부터 출력하다가 n개를 출력하게 되면 하나씩 줄어들어야 함
            if(i<=n){
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                // n이 5인 경우에 i는 9까지 증가한다.
                // 이 경우는 i가 6, 7, 8, 9인 경우를 다룸.
                // 2n-1 에서부터 n+1까지 감소
                for(int j = 2*n-1;j>=i;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}