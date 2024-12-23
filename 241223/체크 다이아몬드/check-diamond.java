import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 위쪽 (1 ~ n번째 줄)
        for (int i = 1; i <= n; i++) {
            // (1) 왼쪽에 찍힐 공백의 개수: n - i
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // (2) 별을 i개 찍되, 별 사이에 공백을 하나씩 넣어줌
            //     예) i=3 이면 "* * *"
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
                if (star < i) {
                    System.out.print(" "); // 별 사이 공백
                }
            }
            System.out.println(); // 줄바꿈
        }

        // 아래쪽 (n+1 ~ 2n-1번째 줄)
        // i = 1부터 n-1까지 증가시키며 (n-i)개의 별을 찍는다.
        for (int i = n - 1; i >= 1; i--) {
            // (1) 왼쪽 공백의 개수: n - i
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // (2) i개의 별을 찍되, 별 사이에 공백 삽입
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
                if (star < i) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 줄바꿈
        }
    }
}
