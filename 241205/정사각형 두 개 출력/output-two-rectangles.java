import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printStar(n);
        System.out.println("");
        printStar(n);
    }

    public static void printStar(int n ){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}