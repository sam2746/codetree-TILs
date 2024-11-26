import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a >= 3000){
            System.out.println("book");

        }
        else if(a >= 1000){
            System.out.println("mask");
        }
        else if(a > 0){
            System.out.println("pen");
        }
        else{
            System.out.println("no");
        }
    }
}