import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();

        // Please write your code here.
        // input charAt 사용해서 완전탐색. ( 나온 다음에 )가 나오는 횟수 세기

        int len = input.length();

        int count = 0;

        for(int i = 0;i<len;i++){
            if(input.charAt(i) == '('){
                for(int j = i;j<len;j++){
                    if(input.charAt(j) == ')'){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}