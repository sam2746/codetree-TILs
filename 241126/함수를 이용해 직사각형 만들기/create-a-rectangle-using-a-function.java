import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        printStar(n, m);
    }

    public static void printStar(int n, int m){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(1);
            }
            System.out.println(" ");
        }
    }
}