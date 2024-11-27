import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력 스캐너
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine(); // 입력 받기
        String operand = line.split(" ")[1]; // 연산자 추출
        int a = Integer.parseInt(line.split(" ")[0]); // 첫 번째 피연산자
        int b = Integer.parseInt(line.split(" ")[2]); // 두 번째 피연산자

        // 연산 수행
        if (operand.equals("+")) {
            sum(a, b);
        } else if (operand.equals("-")) {
            sub(a, b);
        } else if (operand.equals("*")) {
            mul(a, b);
        } else {
            div(a, b);
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
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
