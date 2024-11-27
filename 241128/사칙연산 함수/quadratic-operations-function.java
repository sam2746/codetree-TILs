import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력 스캐너
        Scanner scanner = new Scanner(System.in);

        // 한 줄 입력받기
        String line = scanner.nextLine();

        // 입력 값이 올바른지 검사
        String[] parts = line.split(" ");
        if (parts.length != 3) { // 피연산자 2개와 연산자 1개로 구성되어야 함
            System.out.println("false");
            return;
        }

        // 피연산자와 연산자 추출
        String operand = parts[1];
        int a, b;

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) { // 피연산자가 숫자가 아닌 경우
            System.out.println("false");
            return;
        }

        // 연산 수행
        switch (operand) {
            case "+":
                sum(a, b);
                break;
            case "-":
                sub(a, b);
                break;
            case "*":
                mul(a, b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("False"); // 0으로 나눌 경우 false
                } else {
                    div(a, b);
                }
                break;
            default:
                System.out.println("False"); // 올바르지 않은 연산자
        }
    }

    public static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
