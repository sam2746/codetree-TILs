import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String above = s.split("-")[1];
        String below = s.split("-")[2];

        String temp;
        temp = above;

        above = below;
        below = temp;

        System.out.println("010-"+above+"-"+below);
    }
}