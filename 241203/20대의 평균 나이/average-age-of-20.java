import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        int cum = 0;
        int cnt = 0;

        while(true){
            int age = scanner.nextInt();
            if(age <30 && age>=20){
                cum += age;
                cnt ++;
            }else{
                float avg = (float) cum/cnt;
                System.out.printf("%.2f", avg);
                break;
            }
        }
    }
}