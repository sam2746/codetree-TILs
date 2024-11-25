import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a+b+c);
        System.out.println((a+b+c)/3);
        System.out.println(a+b+c-(a+b+c)/3);

    }
}