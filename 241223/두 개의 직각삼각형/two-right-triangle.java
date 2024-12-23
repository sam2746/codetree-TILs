import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n  = scanner.nextInt();

        //n을 입력받으면 별을 n개 출력하다 1개 출력할때까지 하나씩 줄임

        //줄 하나를 관장하는 for문
        for(int i = 0;i<n;i++){

            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            for(int k = i;k>0;k--){
                System.out.print("  ");
            }
            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}