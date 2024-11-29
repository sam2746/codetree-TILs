import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>=1){
            for(int i = 0;i<b;i++){
                System.out.print(a);
            }
        }else{
            System.out.print(0);
        }
    }
}