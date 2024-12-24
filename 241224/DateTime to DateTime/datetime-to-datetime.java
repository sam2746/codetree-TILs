import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int duemin = 0;

        if(a >= 11){
            duemin += (a-11)*60*24 + 60*b + c - 671;
            System.out.println(duemin);
        }else if(a == 11){ //예외처리 위해 나눔
            if(60*b+c >= 671){
                System.out.println(60*b + c - 671);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(-1);
        }

        
    }
}